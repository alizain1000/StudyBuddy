package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

androidx.recyclerview.widget.RecyclerView Recycler_view = findViewById(R.id.Recycler_view) ;
        ArrayList<constructeor_wali_class> arry = new ArrayList();


        Recycler_view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        arry.add(new constructeor_wali_class(R.drawable.logo,"user 1","03016305590"));
        arry.add(new constructeor_wali_class(R.drawable.logo,"user 2","03016305590"));
        arry.add(new constructeor_wali_class(R.drawable.logo,"user 3","03016305590"));
        arry.add(new constructeor_wali_class(R.drawable.logo,"user 4","03016305590"));
        arry.add(new constructeor_wali_class(R.drawable.logo,"user 5","03016305590"));
        arry.add(new constructeor_wali_class(R.drawable.logo,"user 6","03016305590"));


        self_made_Adapter adaptr = new self_made_Adapter(this,arry);
        Recycler_view.setAdapter(adaptr);









    }
}