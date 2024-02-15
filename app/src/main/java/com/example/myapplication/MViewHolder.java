package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MViewHolder extends RecyclerView.ViewHolder {
    TextView pmu,no;
    public MViewHolder(@NonNull View itemView){
        super(itemView);
        pmu = itemView.findViewById(R.id.pmu);
        no = itemView.findViewById(R.id.no);
    }
}
