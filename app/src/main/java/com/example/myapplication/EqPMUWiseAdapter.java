package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class EqPMUWiseAdapter extends RecyclerView.Adapter<EqPMUWiseAdapter.MyViewHolder> {
    Context context;
    ArrayList<PmuNo> l;
    public EqPMUWiseAdapter(Context context, ArrayList<PmuNo> list) {
        this.context = context;
        this.l=list;
    }
    public void filterList(ArrayList<PmuNo> filterlist) {
        l = filterlist;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(context).inflate(R.layout.eqpmuwisecard,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        PmuNo m=l.get(position);
        try {
            holder.no.setText((CharSequence) Integer.toString(m.getNO()));
            holder.pmu.setText((CharSequence) m.getPMU());
        }
        catch(Exception e){
            Log.e("onBindViewHolder: ",e.toString() );
        }
    }

    @Override
    public int getItemCount() {
        return l.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        LinearLayout materialcard;
        TextView no,pmu;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            materialcard=(LinearLayout) itemView.findViewById(R.id.eqpmuwisecard);
            no=(TextView) itemView.findViewById(R.id.no);
            pmu=(TextView) itemView.findViewById(R.id.pmu);
        }
    }
}
