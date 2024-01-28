package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class feedbackform extends AppCompatActivity {

    ListView lv;
    Button bm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackform);

        lv = findViewById(R.id.listview);
        bm = findViewById(R.id.menu);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("USA");
        arrayList.add("Pakistan");
        arrayList.add("India");
        arrayList.add("Korea");
        arrayList.add("France");

        ArrayAdapter arradap = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(arradap);

        bm.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i2);
            }
        });
    }
    public void bpage(View view){
        Intent pback = new Intent(this, pagemenu.class);
        startActivity(pback);
    }


}