package com.zeneo.emoji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    RecyclerView gridList;
    MainListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridList = findViewById(R.id.gridList);
        gridList.setHasFixedSize(true);
        gridList.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        adapter = new MainListAdapter(new Data().initializeData(),MainActivity.this);
        gridList.setAdapter(adapter);
    }
}
