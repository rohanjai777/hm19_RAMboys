package com.example.android.crobiddoctor2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, Diabetes.class);
        startActivity(intent);
    }
    public void ToAnActivity(View view) {
        Intent intent = new Intent(this, Cervical.class);
        startActivity(intent);
    }
    public void B3(View view) {
        Intent intent = new Intent(this, Heart.class);
        startActivity(intent);
    }
}
