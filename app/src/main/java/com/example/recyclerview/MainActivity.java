package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private List<listitem> listitems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems =new ArrayList<>();


        for(int i = 0; i < 10 ; i++){
            listitem list = new listitem(
                    "helloo" +(i+  1),
                    "my nan=me"
            );

            listitems.add(list);
        }

        adapter = new MyAdapter(listitems , this);
        recyclerView.setAdapter(adapter);


    }
}