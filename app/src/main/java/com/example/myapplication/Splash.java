package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button button=findViewById(R.id.splashBtn);

    }


    public void splashButton(View view) {

        Intent intent=new Intent(Splash.this,MainActivity.class);
        startActivity(intent);
    }
}
