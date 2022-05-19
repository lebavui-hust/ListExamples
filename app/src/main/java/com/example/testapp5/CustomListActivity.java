package com.example.testapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        List<ItemModel> items = new ArrayList<>();
        items.add(new ItemModel(R.drawable.thumb1, "Item 1"));
        items.add(new ItemModel(R.drawable.thumb2, "Item 2"));
        items.add(new ItemModel(R.drawable.thumb3, "Item 3"));
        items.add(new ItemModel(R.drawable.thumb4, "Item 4"));
        items.add(new ItemModel(R.drawable.thumb5, "Item 5"));
        items.add(new ItemModel(R.drawable.thumb6, "Item 6"));
        items.add(new ItemModel(R.drawable.thumb7, "Item 7"));
        items.add(new ItemModel(R.drawable.thumb8, "Item 8"));
        items.add(new ItemModel(R.drawable.thumb9, "Item 9"));
        items.add(new ItemModel(R.drawable.thumb10, "Item 10"));

        ItemAdapter adapter = new ItemAdapter(this, items);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}