package com.example.main_project_android.classes;

import android.widget.ImageView;

public class Buyer extends UserProfile{
    int grade;
    String school;
    String region;
    private int id;
    private static int inc = 0;

    public Buyer(String fullName, int grade, String school, String region) {
        this.id = inc++;

        this.fullName = fullName;
        this.grade = grade;
        this.school = school;
        this.region = region;
        //this.profile_picture = imageView;
        user_status = "Покупатель";

    }
}
