package com.example.rushikesh.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class milk_shake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_shake);
    }
    public void Next(View view) {
        Intent intent1 = new Intent(this,ice_cream.class);
        startActivity(intent1);
    }
}
