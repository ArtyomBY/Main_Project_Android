package com.example.main_project_android.classes;

import android.graphics.drawable.Drawable;

public class Product {

    //private int dish_id;
    private String dish = "";
    private int price = 0;
    //boolean like = false;
    private String description;
    Boolean status; // 0 - нет в наличии 1 - есть в наличии
    private int dishResource;

    public Product() {

    }
    public Product(String name, int price, String description, boolean status, int dishResource){
        dish = name;
        this.price = price;
        this.description = description;
        this.status = status;
        this.dishResource = dishResource;
    }



//    public void add_to_basket(View view){
//
//        Intent i = new Intent(this, BasketActivity.class);
//        startActivity(i);
//
//    }

    public int getDishResource() {
        return dishResource;
    }

    public void setDishResource(int dishResource) {
        this.dishResource = dishResource;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
