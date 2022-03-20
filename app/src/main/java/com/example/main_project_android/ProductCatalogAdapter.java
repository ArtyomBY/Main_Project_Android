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


public class ProductCatalogAdapter extends ArrayAdapter<Product> {

    public ProductCatalogAdapter(Context context, Product[] productList) {
        super(context, R.layout.activity_item_product_catalog, productList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Product product = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_item_product_catalog, null);
        }

        ((TextView) convertView.findViewById(R.id.textView)).setText(product.getDish());
        ((TextView) convertView.findViewById(R.id.textView2)).setText(Integer.toString(product.getPrice()));
        if (product.getDish() == "Устрица")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.ustrica);
        if (product.getDish() == "Питца")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.pizza);
        if (product.getDish() == "Пирог с картошкой")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.kartoshka);

//        CheckBox ch = (CheckBox) convertView.findViewById(R.id.checkbox);
//        ch.setChecked(product.like);
//        ch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                product.like = ((CheckBox) v).isChecked();
//            }
//        });
        return convertView;
    }
}
