package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_SignUp_main extends AppCompatActivity {
Button signin , signup ,admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

  signin = findViewById(R.id.signin);
  signup = findViewById(R.id.signup);
  admin = findViewById(R.id.admin);
  signin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent in = new Intent(getApplicationContext(),Login_stdnt_tchr.class);
          startActivity(in);
      }
  });



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),SignUp_stdnt_tchr.class);
                startActivity(in);
            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Admin_Pannel.class);
                startActivity(in);
            }
        });



    }
}