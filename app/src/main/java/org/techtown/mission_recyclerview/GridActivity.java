package org.techtown.mission_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        RecyclerView recyclerView = findViewById(R.id.grid_recyclerviewlayout);


        GridLayoutManager layoutManager = new GridLayoutManager(this,  2);
        recyclerView.setLayoutManager(layoutManager);
        ShoppingAdapter adapter = new ShoppingAdapter();

        adapter.addItem(new Shopping("피카츄" , "160,000" , "전기 타입" , R.drawable.picachu));
        adapter.addItem(new Shopping("파이리", "160,000" , "불 타입" , R.drawable.filelee));
        adapter.addItem(new Shopping("꼬부기" , "80,000" , "물 타입" , R.drawable.kobugi));
        adapter.addItem(new Shopping("뮤츠" , "200,000" , "페어리 타입" , R.drawable.mu));
        adapter.addItem(new Shopping("피카츄" , "160,000" , "전기 타입" , R.drawable.picachu));
        adapter.addItem(new Shopping("파이리", "160,000" , "불 타입" , R.drawable.filelee));
        adapter.addItem(new Shopping("꼬부기" , "80,000" , "물 타입" , R.drawable.kobugi));
        adapter.addItem(new Shopping("뮤츠" , "200,000" , "페어리 타입" , R.drawable.mu));
        adapter.addItem(new Shopping("피카츄" , "160,000" , "전기 타입" , R.drawable.picachu));
        adapter.addItem(new Shopping("파이리", "160,000" , "불 타입" , R.drawable.filelee));
        adapter.addItem(new Shopping("꼬부기" , "80,000" , "물 타입" , R.drawable.kobugi));
        adapter.addItem(new Shopping("뮤츠" , "200,000" , "페어리 타입" , R.drawable.mu));
        adapter.addItem(new Shopping("롱코트" , "160,000" , "기획상품" , R.drawable.ic_launcher_background));
        adapter.addItem(new Shopping("롱코트" , "160,000" , "기획상품" , R.drawable.ic_launcher_background));

        recyclerView.setAdapter(adapter);

    }
}