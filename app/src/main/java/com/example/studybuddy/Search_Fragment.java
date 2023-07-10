package com.example.studybuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Search_Fragment extends Fragment {



    public Search_Fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_search_, container, false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView holy = v.findViewById(R.id.holy);
 holy.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent in = new Intent(getContext(),Holy_Quran_Teachers.class);
         startActivity(in);
     }
 });



  return  v;


    }
}













