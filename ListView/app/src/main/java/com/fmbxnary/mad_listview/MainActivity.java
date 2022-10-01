package com.fmbxnary.mad_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArrayAdapter, btnCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArrayAdapter = (Button) findViewById(R.id.btnArrayAdapter);
        btnCustomAdapter = (Button) findViewById(R.id.btnCustomAdapter);
        btnArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArrayAdapterActivity.class);
                startActivity(intent);
            }
        });
        btnCustomAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
    }
}