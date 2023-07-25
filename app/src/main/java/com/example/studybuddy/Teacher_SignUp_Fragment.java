package com.example.studybuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Teacher_SignUp_Fragment extends Fragment {
AppCompatButton login;

    public Teacher_SignUp_Fragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_teacher__sign_up_, container, false);
  login = view.findViewById(R.id.login);

  login.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent in = new Intent(getContext(),Login_stdnt_tchr.class);
          startActivity(in);
      }
  });



   return view; }
}












