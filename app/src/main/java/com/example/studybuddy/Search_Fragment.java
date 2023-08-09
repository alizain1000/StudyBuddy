package com.example.studybuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Search_Fragment extends Fragment {
CardView islamic,physics,chemistry,math,english,computer,bio,general,socialogy;


    public Search_Fragment() {
        // Required empty public constructor
    }



    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_search_, container, false);
        islamic = v.findViewById(R.id.islamic);
        bio = v.findViewById(R.id.bio);
       computer = v.findViewById(R.id.computer);
        socialogy = v.findViewById(R.id.socialogy);
        chemistry = v.findViewById(R.id.chemistry);
        physics = v.findViewById(R.id.physics);
        general = v.findViewById(R.id.general);
       english = v.findViewById(R.id.english);
        math = v.findViewById(R.id.math);

        islamic.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent in = new Intent(getContext(),Holy_Quran_Teachers.class);
         startActivity(in);
     }
 });

        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


  return  v;


    }
}













