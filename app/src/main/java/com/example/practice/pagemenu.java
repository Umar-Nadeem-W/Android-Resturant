package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pagemenu extends AppCompatActivity {

    String uname;
    String pword;
    TextView tview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

           super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pagemenu);
            tview = findViewById(R.id.Textview);

            Intent frommain = getIntent();
            uname = frommain.getStringExtra("username");
            pword = frommain.getStringExtra("password");

            tview.setText("Welcome \n" + "Username: " + uname + "\n" + "Password: " + pword);





}

    public void fdbackloader(View view){
        Intent fload = new Intent(this, feedbackform.class);
        startActivity(fload);
    }
}