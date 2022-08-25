package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
public class ItemAdapter extends ArrayAdapter {
    List<items> itemList;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row,parent,false);

        items currentItem = itemList.get(position);
        TextView itemNameView = view.findViewById(R.id.itemName);
        TextView itemPriceView = view.findViewById(R.id.itemPrice);
        ImageView itemImageView = view.findViewById(R.id.itemImage);


        itemNameView.setText(currentItem.getItemName());
        itemImageView.setImageResource(currentItem.getItemImage());
        itemPriceView.setText(String.valueOf(currentItem.getItemPrice()));

        ImageView deleteButton = view.findViewById(R.id.deleteButton);
         deleteButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 itemList.remove(position);
                 notifyDataSetChanged();
             }
         });
        return view;


    }
}
