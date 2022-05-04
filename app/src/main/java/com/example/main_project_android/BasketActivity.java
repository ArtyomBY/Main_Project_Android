package com.example.main_project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.main_project_android.classes.Product;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BasketActivity extends AppCompatActivity {

    int totalPrice;
    TextView tvTotalPrice;
    ListView lv_Basket;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

//        bottomNavigationView = findViewById(R.id.bottomNavigationView);
//        bottomNavigationView.setSelectedItemId(R.id.catatlog_menu);
//        bottomNavigationView.setOnItemSelectedListener(item -> {
//            switch (item.getItemId()){
//                case R.id.catatlog_menu:
//                    Intent intent = new Intent(this, MainActivity_ProductCatalog.class);
//                    startActivity(intent);
//                    break;
//                case R.id.profil_menu:
//                    Intent intent2 = new Intent(this, UserProfileActivity.class);
//                    startActivity(intent2);
//                    break;
//            }
//
//            return true;
//        });

        lv_Basket = findViewById(R.id.basketList);
        //BasketAdapter basketAdapter = new BasketAdapter(this, ,makeProduct());
        //lv_Basket.setAdapter(basketAdapter);

//        Bundle arguments = getIntent().getExtras();
//        int i = arguments.getInt("dishPrice");
//        totalPrice += i;
//        tvTotalPrice.setText(totalPrice);


    }

    public Product[] makeProduct() {
        Product[] arr = new Product[3];

        String[] dishes = {"Пирог с картошкой", "Питца", };
        int[] prices = {16, 35};

        for (int i = 0; i < arr.length; i++) {
            Product product = new Product();
            product.setDish(dishes[i]);
            product.setPrice(prices[i]);
            arr[i] = product;
        }

        return arr;
    }

    public void pay_for_the_shopping_cart(View view) {

    }
}