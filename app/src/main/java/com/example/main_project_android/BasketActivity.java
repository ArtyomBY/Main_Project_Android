package com.example.main_project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.main_project_android.classes.Basket;
import com.example.main_project_android.classes.Product;

import java.util.List;

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

    public void pay_for_the_shopping_cart(View view) {

    }
}