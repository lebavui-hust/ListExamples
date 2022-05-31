package com.example.testapp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListOfListActivity extends AppCompatActivity {

    List<List<ItemModel>> itemss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_list);

        itemss = new ArrayList<>();
        itemss.add(new ArrayList<>());
        itemss.get(0).add(new ItemModel(R.drawable.thumb1, "Item 11"));
        itemss.get(0).add(new ItemModel(R.drawable.thumb2, "Item 12"));
        itemss.get(0).add(new ItemModel(R.drawable.thumb3, "Item 13"));
        itemss.get(0).add(new ItemModel(R.drawable.thumb4, "Item 14"));
        itemss.get(0).add(new ItemModel(R.drawable.thumb5, "Item 15"));
        itemss.add(new ArrayList<>());
        itemss.get(1).add(new ItemModel(R.drawable.thumb6, "Item 21"));
        itemss.get(1).add(new ItemModel(R.drawable.thumb7, "Item 22"));
        itemss.get(1).add(new ItemModel(R.drawable.thumb8, "Item 23"));
        itemss.get(1).add(new ItemModel(R.drawable.thumb9, "Item 24"));
        itemss.add(new ArrayList<>());
        itemss.get(2).add(new ItemModel(R.drawable.thumb10, "Item 31"));
        itemss.get(2).add(new ItemModel(R.drawable.thumb11, "Item 32"));
        itemss.get(2).add(new ItemModel(R.drawable.thumb12, "Item 33"));
        itemss.get(2).add(new ItemModel(R.drawable.thumb13, "Item 34"));
        itemss.add(new ArrayList<>());
        itemss.get(3).add(new ItemModel(R.drawable.thumb14, "Item 41"));
        itemss.get(3).add(new ItemModel(R.drawable.thumb15, "Item 42"));
        itemss.get(3).add(new ItemModel(R.drawable.thumb16, "Item 43"));
        itemss.get(3).add(new ItemModel(R.drawable.thumb17, "Item 44"));
        itemss.get(3).add(new ItemModel(R.drawable.thumb18, "Item 45"));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        VerticalAdapter adapter = new VerticalAdapter(itemss);
        recyclerView.setAdapter(adapter);
    }
}