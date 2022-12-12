package org.techtown.mission_recyclerview;

import static org.techtown.mission_recyclerview.R.id.btn_grid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
  String tag = "MainActivity";

    EditText editTextName;
    EditText editTextBirth;
    EditText edittextNumber;
    ImageView imageview;
    Uri uri;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        editTextName = findViewById(R.id.editText_name);
        editTextBirth = findViewById(R.id.editText_birth);
        edittextNumber = findViewById(R.id.editText_number);



        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        BusinesscardAdapter adapter = new BusinesscardAdapter();



        recyclerView.setAdapter(adapter);

//        adapter.addItem(new BusinesscardActivity("df", "df",uri);

        button = findViewById(R.id.btn_MaicActivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_PICK);
                i.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                startActivity(i);

                 uri = i.getData();
                 String uriToString = uri.toString();

                Log.e(tag, "uri 값 확인 : " + uri);
                Log.e(tag, "uritostring 값 확인 : " + uriToString);


                String name = editTextName.getText().toString();
                String birth = editTextBirth.getText().toString();
                String number = edittextNumber.getText().toString();


                adapter.addItem(new BusinesscardActivity(name,birth,number,uriToString));


                Log.e(tag, "버튼 클릭");

            }
        });

        Button btn_grid = findViewById(R.id.btn_grid);
        btn_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, GridActivity.class);
                startActivity(i);
            }
        });


//        adapter.addItem(new BusinesscardActivity("ㅇㄹ","ㅇㄹ","ㄴㅇㄹ","ㅇㄹ"));
//        recyclerView.setAdapter(adapter);

    }
}