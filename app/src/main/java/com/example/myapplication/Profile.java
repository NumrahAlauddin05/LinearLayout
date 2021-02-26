package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView fnameTv;
    TextView lnameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        fnameTv=findViewById(R.id.fName);
        lnameTv=findViewById(R.id.lName);

        Bundle bundle=getIntent().getExtras();
        String fname=bundle.getString("fname");
        String lname=bundle.getString("lname");

        fnameTv.setText(fname);
        lnameTv.setText(lname);
    }
}
