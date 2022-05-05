package com.example.main_project_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.main_project_android.classes.Buyer;
import com.example.main_project_android.fragments.BasketFragment;
import com.example.main_project_android.fragments.CatalogFragment;
import com.example.main_project_android.fragments.ProductFragment;
import com.example.main_project_android.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity_ProductCatalog extends AppCompatActivity {


    ListView lv_catalog;
    Button goToBasketButton;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_catalog);

        Buyer buyer = new Buyer("Быков Артем Ильич", 10, "МБОУ сош №35", "г. Иваново, Ивановская обл.");
        


        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catatlog_menu);
        replaceFragment(new CatalogFragment());

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.basket_menu:
                    replaceFragment(new BasketFragment());
                    bottomNavigationView.getMenu().findItem(R.id.basket_menu).setChecked(true);
//                    Intent intent = new Intent(this, BasketActivity.class);
//                    startActivity(intent);
                    break;
                case R.id.profil_menu:
                    replaceFragment(new ProfileFragment());
                    bottomNavigationView.getMenu().findItem(R.id.profil_menu).setChecked(true);
//                    Intent intent2 = new Intent(this, UserProfileActivity.class);
//                    startActivity(intent2);
                    break;
                case R.id.catatlog_menu:
                    replaceFragment(new CatalogFragment());
                    bottomNavigationView.getMenu().findItem(R.id.catatlog_menu).setChecked(true);
                    break;
            }


            return true;
        });


    }


    public void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_FrameLayout, fragment);
        fragmentTransaction.commit();

    }



    public void look_at_product(View view) {
        TextView tv = findViewById(R.id.textView);
        String str = tv.getText().toString();
        replaceFragment(new ProductFragment());
//        Intent i = new Intent(MainActivity_ProductCatalog.this, ProductActivity.class);
//        i.putExtra("nd", str);
//        startActivity(i);
    }
    public void put_in_basket(View view) {
        //Basket basket = new Basket()
        replaceFragment(new BasketFragment());
//        Intent i = new Intent(view.getContext(), BasketActivity.class);
//        i.putExtra("dishPrice", a);
//        startActivity(i);
        bottomNavigationView.getMenu().findItem(R.id.basket_menu).setChecked(true);
        Toast.makeText(this, "Товар добавлен в корзину!", Toast.LENGTH_SHORT).show();
    }


    public void goToBasket(View view) {
        //new Basket()
    }
}