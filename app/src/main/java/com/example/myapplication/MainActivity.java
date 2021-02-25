package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstEt;
    EditText lastEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEt=findViewById(R.id.loginFnameEt);
        lastEt=findViewById(R.id.loginLnameEt);
    }

    public void signup(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

    public void login(View view) {


        String fname=firstEt.getText().toString();
        String lname=lastEt.getText().toString();

        Toast.makeText(this, lname, Toast.LENGTH_LONG).show();



    }
}
