package com.example.mobops;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> names = new ArrayList<>();

    Button showbt , addbt;
    EditText personName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showbt = findViewById(R.id.showbt);
        personName = findViewById(R.id.personName);
        addbt = findViewById(R.id.addbt);

        addbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!personName.getText().toString().equals(""))
               names.add(personName.getText().toString());
            }
        });

        showbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k =new Intent(MainActivity.this, ActivityList.class);
                k.putExtra("mykey",names);
                startActivity(k);
            }
        });
    }
}