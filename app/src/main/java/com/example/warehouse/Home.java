package com.example.warehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dialog = new Dialog(this);

    }

    public void ShowAddPopup(View view) {
        TextView closeText;
        dialog.setContentView(R.layout.activity_add_item_pop_up);
        closeText=dialog.findViewById(R.id.txt_close);
        closeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void ShowAddCustomer(View view) {
        Intent intent = new Intent(Home.this,add_item_pop_up.class);
        startActivity(intent);
    }

    public void View_Items(View view) {
        Intent intent = new Intent(Home.this,View_item.class);
        startActivity(intent);
    }

    public void View_Customer(View view) {
       Intent intent = new Intent(Home.this,View_Customer.class);
       startActivity(intent);
    }
}