package com.example.rushikesh.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String nameField,email,Order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button orderSummary = (Button) findViewById(R.id.OrderSummary);
        orderSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameTextView = (EditText)findViewById(R.id.name);
                EditText emailField = (EditText) findViewById(R.id.email);
                nameField = nameTextView.getText().toString();
                email = emailField.getText().toString();
                Order = nameField + email;
                TextView orderTextView = (TextView) findViewById(R.id.namemail);
                orderTextView.setText(Order);
            }
        });
    }

    public void Next(View view) {
        Intent intent1 = new Intent(this,Coffee.class);
        startActivity(intent1);
    }
}
