package com.example.sanyanote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class ItemsActivity extends AppCompatActivity {
    public static ArrayList<Item> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        int position = 0;
        items.add(new Item("Item1", "22:04:2008",position));
        position++;
        items.add(new Item("Item2", "22:04:2008",position));
        position++;
        items.add(new Item("Item3", "22:04:2008",position));
        position++;
        items.add(new Item("Item4", "22:04:2008",position));
        position++;
        items.add(new Item("Item5", "22:04:2008",position));

        DividerItemDecoration divider = new DividerItemDecoration(this, LinearLayoutManager.VERTICAL);
        divider.setDrawable(getResources().getDrawable(R.drawable.divider_view_1));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ItemAdapter(this, items));
        recyclerView.addItemDecoration(divider);

        FloatingActionButton button = findViewById(R.id.button_add);
        button.setOnClickListener(view -> {
            items.add(0,new Item("Item", "22:04:2008",0));
            for (int i = 1; i < items.size(); i++) {
                items.get(i).setPos(i);
            }
            recyclerView.setAdapter(new ItemAdapter(this, items));
        });

    }
}