package com.example.main_project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BasketActivity extends AppCompatActivity {

    int totalPrice;
    TextView tvTotalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

//        Bundle arguments = getIntent().getExtras();
//        int i = arguments.getInt("dishPrice");
//        totalPrice += i;
//        tvTotalPrice.setText(totalPrice);


    }
}