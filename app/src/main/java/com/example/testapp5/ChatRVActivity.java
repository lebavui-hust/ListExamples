package com.example.testapp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ChatRVActivity extends AppCompatActivity {

    List<ChatModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_rvactivity);

        items = new ArrayList<>();
        items.add(new ChatModel(R.drawable.thumb1, "hello", false));
        items.add(new ChatModel(R.drawable.thumb1, "where are you?", false));
        items.add(new ChatModel(R.drawable.thumb2, "hi", true));
        items.add(new ChatModel(R.drawable.thumb2, "i'm home", true));
        items.add(new ChatModel(R.drawable.thumb1, "ok", false));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ChatRVAdapter adapter = new ChatRVAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}