package com.example.practice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class RecyclerResturantAdapter extends RecyclerView.Adapter<RecyclerResturantAdapter.ViewHolder> {

    Context context;
    ArrayList<ResturantModel>arrResturants;
    RecyclerResturantAdapter(Context context, ArrayList<ResturantModel> arrResturants){
        this.context = context;
        this.arrResturants = arrResturants;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.resturant_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    holder.imglogo.setImageResource(arrResturants.get(position).img);
    holder.txtname.setText(arrResturants.get(position).name);

    }

    @Override
    public int getItemCount() {
        return arrResturants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtname;
        ImageView imglogo;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            txtname = itemView.findViewById(R.id.resturantname);
            imglogo = itemView.findViewById(R.id.logopic);
        }
    }
}
