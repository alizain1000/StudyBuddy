package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Holy_Quran_Teachers extends AppCompatActivity {
ListView LV;
ArrayList<String> arr;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy_quran_teachers);
   LV = findViewById(R.id.LV);
   arr = new ArrayList<>();
   arr.add("Teacher1");
   arr.add("Teacher2");
   arr.add("Teacher3");
   arr.add("Teacher4");
   arr.add("Teacher5");
   arr.add("Teacher6");
   arr.add("Teacher7");
   arr.add("Teacher8");
   arr.add("Teacher9");
   arr.add("Teacher10");
   arr.add("Teacher11");
   arr.add("Teacher12");
        ArrayAdapter<String> adp = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arr);
        LV.setAdapter(adp);


























    }
}