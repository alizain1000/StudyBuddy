package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class SignUp_stdnt_tchr extends AppCompatActivity {
    TabLayout tab;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_stdnt_tchr);
        tab =findViewById(R.id.tab);
        vp = findViewById(R.id.vp);
      signUp_adapter adp = new signUp_adapter(getSupportFragmentManager());
        vp.setAdapter(adp);
        tab.setupWithViewPager(vp);



    }
}