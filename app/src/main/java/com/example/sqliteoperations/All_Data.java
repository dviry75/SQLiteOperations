package com.example.sqliteoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class All_Data extends AppCompatActivity {

    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_data);
        tv= (TextView) findViewById(R.id.tv);
        Intent intent=getIntent();

        String allPeople = intent.getExtras().getString("allPeople");

        tv.setText("welcone " + allPeople + " ");




    }
}