package com.example.ad;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalRecyclerAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private final List<Animal> animals;

    public AnimalRecyclerAdapter(List<Animal> animals) {
        this.animals = animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = View.inflate(parent.getContext(), R.layout.animal_row, null);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animals.get(position);
        holder.getNameText().setText(animal.getName());
        holder.getTypeText().setText(animal.getType());
        holder.getPriceText().setText(String.valueOf(animal.getPrice()));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
