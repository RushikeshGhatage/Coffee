package com.example.rushikesh.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ice_cream extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_cream);
    }
    public void Done(View view)
    {
        Toast str= Toast.makeText(this,"Order is Submitted",Toast.LENGTH_LONG);
        str.show();
    }
}
