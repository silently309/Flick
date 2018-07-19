package com.example.nguyennqh.demodragdrop2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener{

    MyRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Rabbit");
        animalNames.add("Cow");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");
        animalNames.add("Chicken");


        RecyclerView recyclerView = findViewById(R.id.listAnimal);

        adapter = new MyRecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(this);

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void onItemClick(View view, int position) {
        Toast.makeText(this,"You click: " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}
