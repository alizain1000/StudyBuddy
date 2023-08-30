package com.example.studybuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class Login_Page extends AppCompatActivity {
    EditText email, password;
    Button login, signup;
    FirebaseAuth auth;
    FirebaseFirestore fstore;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page_new);


        fstore = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(view -> {
            Intent in = new Intent(getApplicationContext(), Signup.class);
            startActivity(in);
            finish();
        });


        login.setOnClickListener(view -> {

            String email1, password1;
            email1 = email.getText().toString();
            password1 = password.getText().toString();


            auth.signInWithEmailAndPassword(email1, password1).addOnSuccessListener(authResult -> checkUserAccessLevel(authResult.getUser().getUid())).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

                }
            });


        });

    }

    private void checkUserAccessLevel(String uid) {
        DocumentReference df = fstore.collection("Users").document(uid);
        df.get().addOnSuccessListener(documentSnapshot -> {
            if (documentSnapshot.getString("Is_Teacher") != null) {
            startActivity(new Intent(getApplicationContext(),Teacher_Dashboard.class));
            finish();
            }
            else if (documentSnapshot.getString("Is_Student") !=null) {
                startActivity(new Intent(getApplicationContext(),Main_Interface.class));
                finish();
            }


        });


    }
    @Override
    protected void onStart() {
        super.onStart();
if (FirebaseAuth.getInstance().getCurrentUser() != null){

    DocumentReference df = FirebaseFirestore.getInstance().collection("Users").document(FirebaseAuth.getInstance().getCurrentUser().getUid());
    df.get().addOnSuccessListener(documentSnapshot -> {

        if (documentSnapshot.getString("Is_Teacher") != null) {


            Intent in = new Intent(getApplicationContext(), Teacher_Dashboard.class);
            startActivity(in);
            finish();
        }
        if (documentSnapshot.getString("Is_Student") !=null) {


            Intent in = new Intent(getApplicationContext(), Main_Interface.class);
            startActivity(in);
            finish();
        }


    }).addOnFailureListener(e -> {
FirebaseAuth.getInstance().signOut();
startActivity(new Intent(getApplicationContext(), Login_Page.class));
finish();
    });

}

    }
}