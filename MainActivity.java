package com.example.yashjindal.dday;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.content.Context.MODE_PRIVATE;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedprefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, Main2Activity.class);
                getIntent().putExtra("calamity", "flood");
                startActivity(act);


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, Main2Activity.class);
                getIntent().putExtra("calamity", "Landslide");
                startActivity(act);


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, Main2Activity.class);
                getIntent().putExtra("calamity", "EarthQuake");
                startActivity(act);


            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, Main2Activity.class);
                getIntent().putExtra("calamity", "Cyclone");
                startActivity(act);


            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(MainActivity.this, Main2Activity.class);
                getIntent().putExtra("calamity", "Hurricane");
                startActivity(act);


            }
        });
        //Intent actt = new Intent(CurrentActivity.this,Main2Activity.class);
        //actt.putExtra(TAG_Name,"flood");

        //startActivity(actt);
    }


}
