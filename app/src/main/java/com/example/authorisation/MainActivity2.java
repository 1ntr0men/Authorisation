package com.example.authorisation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv;
    private ConstraintLayout root;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Resources resources = getResources();
        tv = findViewById(R.id.validate);
        root = findViewById(R.id.root);
        int red = resources.getColor(R.color.red);
        int green = resources.getColor(R.color.teal_200);
        Bundle bundle = getIntent().getExtras();
        if (bundle.get("log").toString().equals("login") && bundle.get("pas").toString().equals("password")) {
            tv.setText("access");
            root.setBackgroundColor(green);
        } else {
            tv.setText("Don't access");
            root.setBackgroundColor(red);
        }
    }
}