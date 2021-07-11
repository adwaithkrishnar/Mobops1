package com.example.mobops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityList extends AppCompatActivity {
    ListView nameList;
    ArrayList<String> listOfNames = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        nameList = findViewById(R.id.namelist);
        listOfNames = getIntent().getStringArrayListExtra("mykey");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listOfNames);

        nameList.setAdapter(arrayAdapter);
    }
}