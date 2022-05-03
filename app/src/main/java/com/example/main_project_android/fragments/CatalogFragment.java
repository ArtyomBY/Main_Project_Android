package com.example.main_project_android.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.example.main_project_android.ProductCatalogAdapter;
import com.example.main_project_android.R;
import com.example.main_project_android.classes.Product;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CatalogFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CatalogFragment extends Fragment {

    ListView lv_catalog;
    Button goToBasketButton;
    BottomNavigationView bottomNavigationView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CatalogFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CatalogFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CatalogFragment newInstance(String param1, String param2) {
        CatalogFragment fragment = new CatalogFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_catalog, container, false);

        lv_catalog = v.findViewById(R.id.product_list);
        ProductCatalogAdapter adapter = new ProductCatalogAdapter(v.getContext(), makeProduct());
        lv_catalog.setAdapter(adapter);

        return v;
    }

    public Product[] makeProduct() {
        Product[] arr = new Product[3];

        String[] dishes = {"Устрица", "Питца", "Пирог с картошкой"};
        int[] prices = {10, 35, 16};

        for (int i = 0; i < arr.length; i++) {
            Product product = new Product();
            product.setDish(dishes[i]);
            product.setPrice(prices[i]);
            arr[i] = product;
        }

//        Catalog catalog = new Catalog(arr);
//        return (List<Product>) catalog;
        return arr;
    }
}