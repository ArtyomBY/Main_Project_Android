package com.example.main_project_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.main_project_android.classes.Product;

import java.util.List;

public class BasketAdapter extends ArrayAdapter {

    private LayoutInflater inflater;
    private int layout;
    private Product[] basketList;

    public BasketAdapter(Context context, int resource, Product[] basketList) {
        super(context, resource,  basketList);
        this.layout = resource;
        this.basketList = basketList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);

        ImageView dishImage = view.findViewById(R.id.imageView);
        TextView dishName = view.findViewById(R.id.textView);
        TextView dishPrice = view.findViewById(R.id.textView2);

        Product product = basketList[position];

        dishImage.setImageResource(product.getDishResource());
        dishName.setText(product.getDish());
        dishPrice.setText(product.getPrice());

        return view;
    }
}
