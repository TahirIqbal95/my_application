package com.example.darwaish.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText username;
    private EditText passward;
    private Button login;

    String user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.EditTxtUName);
        passward = findViewById(R.id.EditTxtPass);
        login = findViewById(R.id.login);




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                user  = username.getText().toString();
                pass = passward.getText().toString();

                if((user.equals("admin") ) && (pass.equals("admin")  ))
                {
                    Intent intent= new Intent(MainActivity.this, activity_menu.class );
                    startActivity(intent);
                }

            }
        });
    }

    }