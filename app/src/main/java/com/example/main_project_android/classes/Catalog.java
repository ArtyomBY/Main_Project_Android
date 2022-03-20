package com.example.main_project_android.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalog {

    List<Product> productList;

    public Catalog(){}
    public Catalog(Product[] productList) {
        this.productList = Arrays.asList(productList);
    }

    public void product_create(String nameDish, int price, String description, boolean status, int dishResource){

        Product product = new Product(nameDish, price, description, status, dishResource);
        productList.add(product);


    }

//    public void add_to_catalog(Product p) {
//
//    }

    public void deleteProduct_fromCatalog(String nameDish){ //int id
        productList.remove(nameDish);
    }

}
