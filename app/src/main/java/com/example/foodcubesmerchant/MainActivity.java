package com.example.foodcubesmerchant;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Intent newActivity;
    Button mon;
    Button tues ;
    Button wednes ;
    Button thurs ;
    Button fri ;
    Button sat ;
    Button sun ;
    Toolbar toolbar;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newActivity = new Intent(MainActivity.this, Menu.class);
        toolbar=findViewById(R.id.mainToolBar);
        toolbar.inflateMenu(R.menu.menuitem);
        toolbar.setTitle("DAYS");
        //toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_material);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mon = findViewById(R.id.Monday);
        tues = findViewById(R.id.Tuesday);
        wednes = findViewById(R.id.Wednesday);
        thurs = findViewById(R.id.Thursday);
        fri = findViewById(R.id.Friday);
        sat = findViewById(R.id.Saturday);
        sun = findViewById(R.id.Sunday);
        mon.setOnClickListener(this);
        tues.setOnClickListener(this);
        wednes.setOnClickListener(this);
        thurs.setOnClickListener(this);
        fri.setOnClickListener(this);
        sat.setOnClickListener(this);
        sun.setOnClickListener(this);

    }

  /*  @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menuitem,menu);
        return super.onCreateOptionsMenu(menu);
    }*/



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Monday:
                newActivity.putExtra("id", Integer.toString(R.id.Monday));
                startActivity(newActivity);
                break;
            case R.id.Tuesday:
                newActivity.putExtra("id", Integer.toString(R.id.Tuesday));
                startActivity(newActivity);
                break;
            case R.id.Wednesday:
                newActivity.putExtra("id", Integer.toString(R.id.Wednesday));
                startActivity(newActivity);
                break;
            case R.id.Thursday:
                newActivity.putExtra("id", Integer.toString(R.id.Thursday));
                startActivity(newActivity);
                break;
            case R.id.Friday:
                newActivity.putExtra("id", Integer.toString(R.id.Friday));
                startActivity(newActivity);
                break;
            case R.id.Saturday:
                newActivity.putExtra("id", Integer.toString(R.id.Saturday));
                startActivity(newActivity);
                break;
            case R.id.Sunday:
                newActivity.putExtra("id", Integer.toString(R.id.Sunday));
                startActivity(newActivity);
                break;
        }
        // newActivity.putExtra("id",Integer.toString())
    }
}

