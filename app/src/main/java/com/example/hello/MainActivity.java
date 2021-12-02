package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView helloText;
    private ImageButton startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.helloText);
        startButton = (ImageButton) findViewById(R.id.startButton);
    }

    public void onStartButtonClick(View view) {
        startButton.setImageResource(R.drawable.images);
        helloText.setVisibility(View.VISIBLE);
        startButton.setClickable(false);
    }
}