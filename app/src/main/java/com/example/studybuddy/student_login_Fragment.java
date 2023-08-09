package com.example.studybuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class student_login_Fragment extends Fragment {
EditText email,password;
AppCompatButton login;
TextView forget;
    public student_login_Fragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_student_login_, container, false);
  email = view.findViewById(R.id.email);
  password = view.findViewById(R.id.password);
  login = view.findViewById(R.id.login);

        forget = view.findViewById(R.id.forget);

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getContext(), Forget_Password.class);
                startActivity(in);

            }
        });
  login.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent  in = new Intent(getContext(),Main_Interface.class);
          startActivity(in);
      }
  });


  return view;  }
}














