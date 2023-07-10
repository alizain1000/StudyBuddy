package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Login_stdnt_tchr extends AppCompatActivity {
    TabLayout tab;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_stdnt_tchr);
        tab =findViewById(R.id.tab);
        vp = findViewById(R.id.vp);
        login_adapter adp = new login_adapter(getSupportFragmentManager());
        vp.setAdapter(adp);
        tab.setupWithViewPager(vp);




    }
}