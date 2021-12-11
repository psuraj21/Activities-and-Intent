package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //getting reference
        showCount = findViewById(R.id.show_count_intent);

        //getting intent
        Intent intent= getIntent();
        String message = intent.getStringExtra(MainActivity.TAG);
        showCount.setText(message);


    }
}