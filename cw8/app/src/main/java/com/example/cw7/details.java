package com.example.cw7;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        setContentView(R.layout.details); super.onCreate(savedInstanceState);

        Bundle bundle =getIntent().getExtras();
        items deliverItem = (items) bundle.getSerializable("Item");

        TextView productName = findViewById(R.id.productName);
        ImageView productImage = findViewById(R.id.productImage);

        productName.setText(deliverItem.getItemName());
        productImage.setImageResource(deliverItem.getItemImage());


    }
}
