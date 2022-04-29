package com.example.main_project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UserProfileActivity extends AppCompatActivity {

    ImageView profileImage;
    TextView profile_name, profile_type, profile_class, profile_school, profile_region;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.catatlog_menu);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.basket_menu:
                    Intent intent = new Intent(this, BasketActivity.class);
                    startActivity(intent);
                    break;
                case R.id.catatlog_menu:
                    Intent intent2 = new Intent(this, MainActivity_Catalog.class);
                    startActivity(intent2);
                    break;
            }

            return true;
        });

        profileImage = findViewById(R.id.profileImage);
        profile_name = findViewById(R.id.profile_name);
        profile_type = findViewById(R.id.profile_type);
        profile_class = findViewById(R.id.profile_class);
        profile_school = findViewById(R.id.profile_school);
        profile_region = findViewById(R.id.profile_region);

        profileImage.setImageResource(R.drawable.typical_user);
    }
}