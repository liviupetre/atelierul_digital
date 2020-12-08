package com.example.ad;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Animal> animals = getAnimals();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        AnimalRecyclerAdapter adapter = new AnimalRecyclerAdapter(animals);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<Animal> getAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal("A", "A", 1));
        animals.add(new Animal("B", "A", 2));
        animals.add(new Animal("C", "A", 3));
        animals.add(new Animal("D", "B", 4));
        animals.add(new Animal("E", "B", 5));
        animals.add(new Animal("F", "B", 6));
        animals.add(new Animal("G", "C", 7));
        animals.add(new Animal("H", "C", 8));
        animals.add(new Animal("I", "C", 9));
        animals.add(new Animal("J", "D", 10));
        return animals;
    }
}