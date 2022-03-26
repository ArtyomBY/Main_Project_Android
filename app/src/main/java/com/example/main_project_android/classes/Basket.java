package com.example.main_project_android.classes;

import java.util.List;

public class Basket {
    List<Product> productList_forPayment;
    private double total_price_basket;
    private boolean basket_status;

    public Basket(List<Product> basketList, double total_price_basket){
        this.productList_forPayment = basketList;
        this.total_price_basket = total_price_basket;
        basket_status = false;
    }

    public void addToProductList_forPayment() {
        productList_forPayment.add(new Product());
    };


    public void deleteProduct_fromBasket(String nameDish){ // int id

        productList_forPayment.remove(nameDish);

    }

    public void payment(int id, double d){

    }


    public double getTotal_price_basket() {
        return total_price_basket;
    }

    public void setTotal_price_basket(double total_price_basket) {
        this.total_price_basket = total_price_basket;
    }

    public boolean isBasket_status() {
        return basket_status;
    }

    public void setBasket_status(boolean basket_status) {
        this.basket_status = basket_status;
    }
}
