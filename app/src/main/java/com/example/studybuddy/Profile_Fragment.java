package com.example.studybuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;


public class Profile_Fragment extends Fragment {

FirebaseAuth auth;
Button logout;

    public Profile_Fragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =   inflater.inflate(R.layout.fragment_profile_, container, false);



logout = view.findViewById(R.id.logout);

logout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      FirebaseAuth.getInstance().signOut();
      startActivity(new Intent(getContext(),Login_Page.class));
    }
});

















        return view;   }
}