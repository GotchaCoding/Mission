package org.techtown.mission_recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BusinesscardAdapter extends RecyclerView.Adapter<BusinesscardAdapter.ViewHolder>{
    ArrayList<BusinesscardActivity> itemslist = new ArrayList<BusinesscardActivity>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.businesscard_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BusinesscardActivity item = itemslist.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return itemslist.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView_A;
        TextView textView_name_A;
        TextView textView_birth_A;
        TextView textView_num_A;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_name_A = itemView.findViewById(R.id.textview_name);
            textView_birth_A = itemView.findViewById(R.id.textview_birth);
            textView_num_A = itemView.findViewById(R.id.textview_number);
            imageView_A = itemView.findViewById(R.id.imageView_profile);
        }

        public void setItem(BusinesscardActivity item){
            textView_name_A.setText(item.getName());
            textView_birth_A.setText(item.getBirth());
            textView_num_A.setText(item.getNumber());

            Log.e("Adapter" , "itme.getPicture : " + item.getPicture());
            Glide.with(itemView).load(R.drawable.picachu).apply(new RequestOptions().circleCrop()).into(imageView_A);
//            Glide.with(itemView).load(item.getPicture()).apply(new RequestOptions().circleCrop()).into(imageView_A);
//            imageView_A.setImageResource(R.drawable.ic_launcher_background);

        }
    }

    public void addItem(BusinesscardActivity item){

        itemslist.add(item);
        notifyDataSetChanged();

    }

     public void setArraylist(){

     }

}
