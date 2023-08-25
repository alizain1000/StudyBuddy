package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {
AppCompatButton login;
TextView signup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
   login.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent in = new Intent(getApplicationContext(),Main_Interface.class);
           startActivity(in);
       }
   });


  signup.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent in = new Intent(getApplicationContext(),Signup.class);
           startActivity(in);
       }
   });




    }
}