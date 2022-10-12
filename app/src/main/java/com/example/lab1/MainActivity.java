package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View v)
    {
        TextView tv = (TextView)findViewById(R.id.View);
        tv.setText("Welcome to android");
    }
    public void changecolor(View v){
        TextView text = (TextView) findViewById(R.id.View);
        text.setTextColor(Color.parseColor("#FFFF0000"));
    }

}