package com.example.studybuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Main_Interface extends AppCompatActivity {
    private static final String ROOT_FRAGMENT_TAG = "null";
    BottomNavigationView btm_nav;
FrameLayout frame;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
       btm_nav = findViewById(R.id.bnav);
        load(new Home_Fragment(),0);
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.home){
                    load(new Home_Fragment(),0);

                }if (id == R.id.find){
                    load(new Search_Fragment(),1);

                }if (id == R.id.profile){
                    load(new Profile_Fragment(),2);

                }


                return true;

            }
        });


    }
    public void load (Fragment fragment, int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag==0){
            ft.add(R.id.framelayout,fragment);
            fm.popBackStack(ROOT_FRAGMENT_TAG,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            ft.addToBackStack(ROOT_FRAGMENT_TAG);}
        else {
            ft.replace(R.id.framelayout, fragment);
            ft.addToBackStack(null);}

        ft.commit();








    }
        }





