package com.example.main_project_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.main_project_android.classes.Basket;
import com.example.main_project_android.classes.Catalog;
import com.example.main_project_android.classes.Product;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity_Catalog extends Activity {


    ListView lv_catalog;
    Button goToBasketButton;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_catalog);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catatlog_menu);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.basket_menu:
                    Intent intent = new Intent(this, BasketActivity.class);
                    startActivity(intent);
                    break;
                case R.id.profil_menu:
                    Intent intent2 = new Intent(this, UserProfileActivity.class);
                    startActivity(intent2);
                    break;
            }

            return true;
        });

        lv_catalog = findViewById(R.id.product_list);
        ProductCatalogAdapter adapter = new ProductCatalogAdapter(this, makeProduct());
        lv_catalog.setAdapter(adapter);

//        Catalog catalog = new Catalog();
//        catalog.product_create("Лапоть", 20,"", true, 1);
        
    }


    public Product[] makeProduct() {
        Product[] arr = new Product[3];

        String[] dishes = {"Устрица", "Питца", "Пирог с картошкой"};
        int[] prices = {10, 35, 16};

        for (int i = 0; i < arr.length; i++) {
            Product product = new Product();
            product.setDish(dishes[i]);
            product.setPrice(prices[i]);
            arr[i] = product;
        }

//        Catalog catalog = new Catalog(arr);
//        return (List<Product>) catalog;
        return arr;
    }
    public void look_at_product(View view) {
        TextView tv = findViewById(R.id.textView);
        String str = tv.getText().toString();
        Intent i = new Intent(MainActivity_Catalog.this, ProductActivity.class);
        i.putExtra("nd", str);
        startActivity(i);
    }
    public void goToBasket(View view) {
        //new Basket()
    }
}