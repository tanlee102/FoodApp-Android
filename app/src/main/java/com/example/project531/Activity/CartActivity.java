package com.example.project531.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


import com.example.project531.Adapter.CartListAdapter;
import com.example.project531.Adapter.FoodListAdapter;
import com.example.project531.Adapter.FoodListAdapterOrdered;
import com.example.project531.Domain.FoodItem;
import com.example.project531.Helper.ManagementCart;
import com.example.project531.Interface.ChangeNumberItemsListener;
import com.example.project531.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewList;
    private ManagementCart managementCart;
    private TextView totalFeeTxt, taxTxt, deliveryTxt, totalTxt, emptyTxt;
    private double tax;
    private ScrollView scrollView;

    private RecyclerView rcv_list_order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        managementCart = new ManagementCart(this);

        initView();
        initList();
        bottomNavigation();
        calculateCard();


        Intent i = new Intent(this, ShowDetailActivity.class);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(i);
            }
        });


        rcv_list_order = findViewById(R.id.rcv_list_order);
        recyclerViewListFood();

    }

    private void recyclerViewListFood() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rcv_list_order.setLayoutManager(linearLayoutManager);

        ArrayList<FoodItem> foodlist = new ArrayList<>();
        foodlist.add(new FoodItem("Pepperoni pizza", "pizza1", "slices pepperoni ,mozzarella cheese, fresh oregano,  ground black pepper, pizza sauce", 13.0, 5, 0));
        foodlist.add(new FoodItem("Chesse Burger", "burger", "beef, Gouda Cheese, Special sauce, Lettuce, tomato ", 15.20, 4, 2));
        foodlist.add(new FoodItem("Vagetable pizza", "pizza3", " olive oil, Vegetable oil, pitted Kalamata, cherry tomatoes, fresh oregano, basil", 11.0, 3, 3));

        adapter = new FoodListAdapterOrdered(foodlist);
        rcv_list_order.setAdapter(adapter);
    }

    private void bottomNavigation() {
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout cartBtn = findViewById(R.id.cartBtn);

//        homeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(CartActivity.this, MainActivity.class));
//            }
//        });
//
//        cartBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(CartActivity.this, CartActivity.class));
//            }
//        });
    }

    private void initList() {
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        recyclerViewList.setLayoutManager(linearLayoutManager);
//        adapter = new CartListAdapter(managementCart.getListCart(), this, new ChangeNumberItemsListener() {
//            @Override
//            public void changed() {
//                calculateCard();
//            }
//        });
//
//        recyclerViewList.setAdapter(adapter);
//        if (managementCart.getListCart().isEmpty()) {
//            emptyTxt.setVisibility(View.VISIBLE);
//            scrollView.setVisibility(View.GONE);
//        } else {
//            emptyTxt.setVisibility(View.GONE);
//            scrollView.setVisibility(View.VISIBLE);
//        }
    }

    private void calculateCard() {
//        double percentTax = 0.02;  //you can change this item for tax price
//        double delivery = 10;     //you can change this item you need price for delivery
//
//        tax = Math.round((managementCart.getTotalFee() * percentTax) * 100.0) / 100.0;
//        double total = Math.round((managementCart.getTotalFee() + tax + delivery) * 100.0) / 100.0;
//        double itemTotal = Math.round(managementCart.getTotalFee() * 100.0) / 100.0;
//
//        totalFeeTxt.setText("$" + itemTotal);
//        taxTxt.setText("$" + tax);
//        deliveryTxt.setText("$" + delivery);
//        totalTxt.setText("$" + total);
    }

    private void initView() {
//        totalFeeTxt = findViewById(R.id.totalFeeTxt);
//        taxTxt = findViewById(R.id.taxTxt);
//        deliveryTxt = findViewById(R.id.deliveryTxt);
//        totalTxt = findViewById(R.id.totalTxt);
//        recyclerViewList = findViewById(R.id.view);
//        scrollView = findViewById(R.id.scrollView);
//        emptyTxt = findViewById(R.id.emptyTxt);
    }



}
