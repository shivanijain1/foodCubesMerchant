package com.example.foodcubesmerchant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Menu extends AppCompatActivity {
    TabItem breakfast,lunch,dinner;
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewpager;
   PagerViewAdapter pagerViewAdapter;
    // Intent newActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tabLayout = findViewById(R.id.tabs);
        breakfast = findViewById(R.id.Breakfast);
        lunch = findViewById(R.id.Lunch);
        dinner = findViewById(R.id.Dinner);
        // newActivity = new Intent(Menu.this, toolbar.class);
        //startActivity(newActivity);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewpager = findViewById(R.id.viewpager);
        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());
        viewpager.setAdapter(pagerViewAdapter);


       // tabLayout.setupWithViewPager(viewpager);
     /* breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(0);
            }
        });
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(1);
            }
        });
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewpager.setCurrentItem(2);
            }
        });

*/
     viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pagerViewAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition() == 1) {
                    pagerViewAdapter.notifyDataSetChanged();
                }
                if (tab.getPosition() == 2) {
                    pagerViewAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        // getSupportActionBar().setTitle("Menu");





    }



}


