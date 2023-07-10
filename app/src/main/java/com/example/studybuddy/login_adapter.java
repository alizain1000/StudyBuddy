package com.example.studybuddy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class login_adapter extends FragmentPagerAdapter {
    public login_adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int p) {

        if (p ==0){

            return  new student_login_Fragment();
        } else
            return  new Teacher_login_Fragment();

    }

    @Override
    public int getCount() {
return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int p) {
        if (p == 0) {


            return "Student";
        } else {
            return "Teacher";
        }


    }

}











