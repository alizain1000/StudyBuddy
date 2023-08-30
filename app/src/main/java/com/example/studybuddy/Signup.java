package com.example.studybuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Signup extends AppCompatActivity {
    EditText name, email, password;
    Button register;
    FirebaseAuth auth;
    FirebaseFirestore fstore;
    CheckBox Is_teacher, Is_student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_new);


        Is_teacher = findViewById(R.id.teacher);
        Is_student = findViewById(R.id.student);
        fstore = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();
        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        register = findViewById(R.id.register);
        Is_student.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Is_student.isChecked()) {
                    Is_teacher.setChecked(false);
                }
            }
        });
        Is_teacher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Is_teacher.isChecked()) {
                    Is_student.setChecked(false);
                }
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View view) {
                String name1, password1, email1;
                name1 = name.getText().toString();
                password1 = password.getText().toString();
                email1 = email.getText().toString();

                if (!(Is_teacher.isChecked() || Is_student.isChecked())) {
                    Toast.makeText(Signup.this, "Select the accouont type", Toast.LENGTH_SHORT).show();
                    return;
                }

                auth.createUserWithEmailAndPassword(email1, password1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = auth.getCurrentUser();
                            DocumentReference def = fstore.collection("Users").document(user.getUid());
                            Map<String, Object> userInfo = new HashMap<>();
                            userInfo.put("Name", name1);
                            userInfo.put("E Mail", email1);
                            userInfo.put("password", password1);
                            if (Is_teacher.isChecked()) {
                                userInfo.put("Is_Teacher", "1");
                            }
                            if (Is_student.isChecked()) {

                                userInfo.put("Is_Student", "1");
                            }
                            def.set(userInfo);
                            Toast.makeText(Signup.this, "Registration is successful", Toast.LENGTH_SHORT).show();

                            if (Is_teacher.isChecked()) {


                                Intent in = new Intent(getApplicationContext(), Teacher_Dashboard.class);
                                startActivity(in);
                                finish();
                            }
                            if (Is_student.isChecked()) {


                                Intent in = new Intent(getApplicationContext(), Main_Interface.class);
                                startActivity(in);
                                finish();
                            }


                        } else {

                            Toast.makeText(Signup.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }
        });


    }
}