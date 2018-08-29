package com.example.darwaish.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.sql.Array;
import java.util.ArrayList;

public class activity_menu extends AppCompatActivity {

    private Button type;
    private Button transection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

       type = findViewById(R.id.BtnType);
       transection= findViewById(R.id.BtnTransaction);



       type.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent = new Intent(activity_menu.this,activity_type.class);
               startActivity(intent);

           }
       });

        transection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity_menu.this,activity_transaction.class);
                startActivity(intent);


            }
        });


    }
}
