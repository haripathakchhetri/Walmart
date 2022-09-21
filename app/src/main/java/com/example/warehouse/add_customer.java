package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class add_customer extends AppCompatActivity {
    EditText c_name, c_Add;
    Button add_customer;
    ImageView add_Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);

        c_name = findViewById(R.id.et_customer_name);
        c_Add = findViewById(R.id.et_customer_address);
        add_customer = findViewById(R.id.add_customer);
        add_Image = findViewById(R.id.add_Image);

        add_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CustomerName=c_name.getText().toString().trim();
                String CustomerAddress=c_Add.getText().toString().trim();

                Intent intent = new Intent(add_customer.this,View_Customer.class);
                intent.putExtra("Customer_Name",CustomerName);
                intent.putExtra("Customer_Address",CustomerAddress);
                startActivity(intent);
                finish();
            }
        });
    }
}