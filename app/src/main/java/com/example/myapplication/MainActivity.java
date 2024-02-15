package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PmuNoAdapter pmuAdapter;
    private List<PmuNo> pmuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        pmuList = new ArrayList<>();
        pmuAdapter = new PmuNoAdapter(pmuList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(pmuAdapter);

        // Add sample data
        PmuNo pmu1 = new PmuNo("PMU-Bongaigaon", 1);
        pmuList.add(pmu1);
        PmuNo pmu2 = new PmuNo("PMU-Dhubri", 2);
        pmuList.add(pmu2);
        PmuNo pmu3 = new PmuNo("PMU-Diphu", 1);
        pmuList.add(pmu3);

        // Notify the adapter about the data change
        pmuAdapter.notifyDataSetChanged();
    }
}