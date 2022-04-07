package com.example.main_project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class UserProfileActivity extends AppCompatActivity {

    ImageView profileImage;
    TextView profile_name, profile_type, profile_class, profile_school, profile_region;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        profileImage = findViewById(R.id.profileImage);
        profile_name = findViewById(R.id.profile_name);
        profile_type = findViewById(R.id.profile_type);
        profile_class = findViewById(R.id.profile_class);
        profile_school = findViewById(R.id.profile_school);
        profile_region = findViewById(R.id.profile_region);

        profileImage.setImageResource(R.drawable.typical_user);
    }
}