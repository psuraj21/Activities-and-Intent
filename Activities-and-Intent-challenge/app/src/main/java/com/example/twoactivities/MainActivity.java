package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_one;
    private Button button_two;
    private Button button_three;
    public static final String EXTRA_PASSAGE="com.example.twoactivities.extra.PASSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_one=findViewById(R.id.text_btn_one);
        button_two=findViewById(R.id.text_btn_two);
        button_three=findViewById(R.id.text_btn_three);

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_PASSAGE,getResources().getString(R.string.passage_one));
                startActivity(intent);
            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_PASSAGE,getResources().getString(R.string.passage_two));
                startActivity(intent);
            }
        });
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_PASSAGE,getResources().getString(R.string.passage_three));
                startActivity(intent);
            }
        });
    }

}