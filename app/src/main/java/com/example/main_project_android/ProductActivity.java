package com.example.main_project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.main_project_android.classes.Basket;
import com.example.main_project_android.classes.Product;

public class ProductActivity extends AppCompatActivity {

    TextView tvNameDish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        tvNameDish = findViewById(R.id.tvNameDish);
        String nameDish = getIntent().getStringExtra("nd");
        tvNameDish.setText(nameDish);

    }

}