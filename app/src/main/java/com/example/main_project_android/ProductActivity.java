package com.example.main_project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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


    public void put_in_basket(View view) {
        Intent i = new Intent(view.getContext(), BasketActivity.class);
//        int a = 20;
//        i.putExtra("dishPrice", a);
        startActivity(i);
        Toast.makeText(this, "Товар добавлен в корзину!", Toast.LENGTH_SHORT).show();
    }

//    public void look_at_product(View view) {
//        TextView tv = findViewById(R.id.textView);
//        String str = tv.getText().toString();
//        Intent i = new Intent(view.getContext(), ProductActivity.class);
//        i.putExtra("nd", str);
//        startActivity(i);
//    }
}