package com.example.main_project_android;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.example.main_project_android.classes.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderListAdapter extends ArrayAdapter<Order> {

    public OrderListAdapter(@NonNull Context context, int resource,  @NonNull ArrayList<Order> objects) {
        super(context, resource, objects);
    }

}
