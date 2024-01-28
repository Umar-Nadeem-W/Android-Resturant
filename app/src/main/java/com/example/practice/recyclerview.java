package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerview extends AppCompatActivity {
ArrayList<ResturantModel> arrResturants= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        RecyclerView rview = findViewById(R.id.recyclerContact);
        rview.setLayoutManager(new LinearLayoutManager(this));


        arrResturants.add(new ResturantModel(R.drawable.dragonhut, "Dragon hut"));
        arrResturants.add(new ResturantModel(R.drawable.dragonhut, "Dragon hut"));
        arrResturants.add(new ResturantModel(R.drawable.fiveguys, "Five Guys"));
        arrResturants.add(new ResturantModel(R.drawable.bk, "Burger king"));
        arrResturants.add(new ResturantModel(R.drawable.kfc, "KFC"));
        arrResturants.add(new ResturantModel(R.drawable.mcdonalds, "Mcdonalds"));
        arrResturants.add(new ResturantModel(R.drawable.nigerianvilla, "Nigerian Villa"));
        arrResturants.add(new ResturantModel(R.drawable.olovegarden, "Olive Garden"));
        arrResturants.add(new ResturantModel(R.drawable.outback, "Outback Steakhouse"));
        arrResturants.add(new ResturantModel(R.drawable.papajohns, "Papa John's"));
        arrResturants.add(new ResturantModel(R.drawable.salut, "Salut"));
        arrResturants.add(new ResturantModel(R.drawable.shinbo, "Shinbo"));
        arrResturants.add(new ResturantModel(R.drawable.tacobell, "Tacobell"));
        arrResturants.add(new ResturantModel(R.drawable.tarka, "Tarka"));
        arrResturants.add(new ResturantModel(R.drawable.wendys, "Wendy's"));

        RecyclerResturantAdapter adapter = new RecyclerResturantAdapter(this, arrResturants);

        rview.setAdapter(adapter);
    }

}