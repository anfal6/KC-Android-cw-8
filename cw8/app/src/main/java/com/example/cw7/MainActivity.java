package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<items> itemsArrayList =new ArrayList<>();
    int currentItem = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView itemName = findViewById(R.id.itemName);
        TextView itemPrice = findViewById(R.id.itemPrice);
        ImageView itemImage = findViewById(R.id.itemImage);

        items item1 = new items("cheese",R.drawable.cheese,26.7);
        items item2 = new items("chocolate",R.drawable.chocolate,6.8);
        items item3 = new items("coffee",R.drawable.coffee,11);
        items item4 = new items("donut",R.drawable.donut,9.5);
        items item5 = new items("fries",R.drawable.fries,34.1);
        items item6 = new items("honey",R.drawable.honey,85.7);



        itemsArrayList.add(item1);
        itemsArrayList.add(item2);
        itemsArrayList.add(item3);
        itemsArrayList.add(item4);
        itemsArrayList.add(item5);
        itemsArrayList.add(item6);


        ItemAdapter ItemAdapter = new ItemAdapter(this,0,itemsArrayList);

      ListView listview = findViewById(R.id.listView);
      listview.setAdapter(ItemAdapter);

  listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
          items currentItem = itemsArrayList.get(i);
          Intent intent = new Intent(MainActivity.this, details.class);
          intent.putExtra("Item",currentItem);

          startActivity(intent);
      }
  });

            }
        }

