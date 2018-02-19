package com.example.rushikesh.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea);
    }
    public void Next(View view) {
        Intent intent1 = new Intent(this,milk_shake.class);
        startActivity(intent1);
    }
}
