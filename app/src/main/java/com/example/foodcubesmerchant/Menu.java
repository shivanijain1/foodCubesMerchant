package com.example.foodcubesmerchant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    TextView breakfast, lunch, dinner;
    ViewPager viewpager;
    PagerViewAdapter pagerViewAdapter;
    // Intent newActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        breakfast = findViewById(R.id.Breakfast);
        lunch = findViewById(R.id.Lunch);
        dinner = findViewById(R.id.Dinner);
        // newActivity = new Intent(Menu.this, toolbar.class);
        //startActivity(newActivity);

        viewpager = findViewById(R.id.toolbar);
        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());
        viewpager.setAdapter(pagerViewAdapter);
        breakfast.setOnClickListener(new View.OnClickListener() {
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
       // getSupportActionBar().setTitle("Menu");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                onPageSelected(position);
            }

            @Override
            public void onPageSelected(int position) {
                onChangeTab (position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void onChangeTab(int position) {
      /*  if (position==0) Toast.makeText(this, "breakfast", Toast.LENGTH_LONG).show();
        if (position==1) Toast.makeText(this, "lunch", Toast.LENGTH_LONG).show();
        if (position==2) Toast.makeText(this, "dinner", Toast.LENGTH_LONG).show();*/

    }

}

