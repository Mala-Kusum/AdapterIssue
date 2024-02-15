package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView r;
    EqPMUWiseAdapter a;
    ArrayList<PmuNo> l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r= findViewById(R.id.r);
        l=new ArrayList<>();
        a=new EqPMUWiseAdapter(this,l);
        r.setLayoutManager(new LinearLayoutManager(this));
        r.setAdapter(a);
        PmuNo m1 = new PmuNo("PMU-Bongaigaon",1);
        l.add(m1);
        a.notifyDataSetChanged();
        PmuNo m2 = new PmuNo("PMU-Dhubri",2);
        l.add(m2);
        a.notifyDataSetChanged();
        PmuNo m3 = new PmuNo("PMU-Diphu",1);
        l.add(m3);
        a.notifyDataSetChanged();
    }
}