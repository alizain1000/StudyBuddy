package com.example.studybuddy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class Teacher_SignUp_Fragment extends Fragment {
AppCompatButton login;
    EditText email,password;


    public Teacher_SignUp_Fragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_teacher__sign_up_, container, false);


        FirebaseAuth auth = FirebaseAuth.getInstance();
  login = view.findViewById(R.id.login);
        email = view.findViewById(R.id.email);
        password = view.findViewById(R.id.password);

  login.setOnClickListener(new View.OnClickListener() {
          @Override
      public void onClick(View v) {
          String mail = email.getText().toString();
          String pass =password.getText().toString();

          auth.createUserWithEmailAndPassword(mail, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
              @Override
              public void onComplete(@NonNull Task<AuthResult> task) {
                  if (task.isSuccessful()) {
                      Intent in = new Intent(getContext(),Login_stdnt_tchr.class);


                      startActivity(in);

                  } else

                  {
                      Toast.makeText(getContext(), Objects.requireNonNull(task.getException()).getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                  }
              }
          });


      }
  });



   return view; }
}












