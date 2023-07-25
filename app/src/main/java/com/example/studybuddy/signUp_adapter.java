package com.example.studybuddy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class signUp_adapter extends FragmentPagerAdapter {
    public signUp_adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int p) {

        if (p ==0){

            return  new Student_SignUp_Fragment();
        } else if (p==1)
        {return  new Teacher_SignUp_Fragment();}else return new Admin_Login_Fragment();

    }


    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int p) {
        if (p == 0) {


            return "Student";
        } else if (p==1){
            return "Teacher";
        }else return "Admin";


    }
}













