package com.example.rushikesh.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Coffee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);
    }
    public void Next(View view) {
        Intent intent1 = new Intent(this,Tea.class);
        startActivity(intent1);
    }
}
