package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText eml;
EditText pass;
Button lgin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     eml = findViewById(R.id.email);
      pass = findViewById(R.id.password);
      lgin = findViewById(R.id.login);






     lgin.setOnClickListener(new View.OnClickListener(){
     @Override
         public void onClick(View view){
         Intent i1 = new Intent(getApplicationContext(),pagemenu.class);
         String str1 = eml.getText().toString();
         String str2 = pass.getText().toString();
         String name = "umar@gmail.com";
         String password = "123";

         i1.putExtra("username", str1);
         i1.putExtra("password", str2);
         if ((str1.equals(name)) && (str2.equals(password))) {
             startActivity(i1);
         }
         else
         {
             Toast.makeText(MainActivity.this, "Wrong Credentials", Toast.LENGTH_LONG).show();
         }
     }



     });
    }

}