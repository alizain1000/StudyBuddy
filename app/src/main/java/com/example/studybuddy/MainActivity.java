package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn,btn2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  btn = findViewById(R.id.btn);
  btn2 = findViewById(R.id.btn2);
  btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent in = new Intent(getApplicationContext(),Main_Interface.class);
          startActivity(in);
      }
  });
 btn2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent in = new Intent(getApplicationContext(), Login_SignUp_main.class);
          startActivity(in);
      }
  });


    }
}