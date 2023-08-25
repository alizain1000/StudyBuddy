package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Teacher_Dashboard extends AppCompatActivity {
CardView videocalling;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teachers_dashboard);

        videocalling  = findViewById(R.id.videocalling);
videocalling.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent in = new Intent(getApplicationContext(), videocalling.class);
        startActivity(in);
    }
});





    }
}




















