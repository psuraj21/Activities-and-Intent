package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView passage_text;
    public static final String TAG=SecondActivity.class.getSimpleName();
    private String PASSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        passage_text=findViewById(R.id.passage_text);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_PASSAGE);
        if(message!=null) {
            passage_text.setText(message);
        }
        else{
            Log.d(TAG,"message not received" );
        }

    }
}