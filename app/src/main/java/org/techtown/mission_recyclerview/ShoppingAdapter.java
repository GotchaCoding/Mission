package org.techtown.mission_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingAdapter.ViewHolder> {
    ArrayList<Shopping> itemslist = new ArrayList<Shopping>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.shopping_item, parent, false);
       return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Shopping item = itemslist.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return itemslist.size();
    }


   static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textview1;
        TextView textview2;
        TextView textview3;
        ImageView picture;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textview1 = itemView.findViewById(R.id.grid_name);
            textview2 = itemView.findViewById(R.id.grid_price);
            textview3 = itemView.findViewById(R.id.grid_comment);
            picture = itemView.findViewById(R.id.item_picture);

        }
        public void setItem(Shopping item){
           textview1.setText(item.getName());
            textview2.setText(item.getPrice());
            textview3.setText(item.getComment());
            picture.setImageResource(item.getPicture());


        }


        }
    public void addItem(Shopping item) {
        itemslist.add(item);
    }
    }


