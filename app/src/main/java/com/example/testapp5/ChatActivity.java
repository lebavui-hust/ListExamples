package com.example.testapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    List<ChatModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        items = new ArrayList<>();
        items.add(new ChatModel(R.drawable.thumb1, "hello", false));
        items.add(new ChatModel(R.drawable.thumb1, "where are you?", false));
        items.add(new ChatModel(R.drawable.thumb2, "hi", true));
        items.add(new ChatModel(R.drawable.thumb2, "i'm home", true));
        items.add(new ChatModel(R.drawable.thumb1, "ok", false));

        ChatAdapter adapter = new ChatAdapter(items);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}