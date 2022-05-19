package com.example.testapp5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> captions;
    List<Integer> thumbs;
    List<Integer> images;

    ImageView imageLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageLarge = findViewById(R.id.image_large);

        captions = new ArrayList<>();
        thumbs = new ArrayList<>();
        images = new ArrayList<>();

        captions.add("Item 1");
        thumbs.add(R.drawable.thumb1);
        images.add(R.drawable.wall1);

        captions.add("Item 2");
        thumbs.add(R.drawable.thumb2);
        images.add(R.drawable.wall2);

        captions.add("Item 3");
        thumbs.add(R.drawable.thumb3);
        images.add(R.drawable.wall3);

        captions.add("Item 4");
        thumbs.add(R.drawable.thumb4);
        images.add(R.drawable.wall4);

        captions.add("Item 5");
        thumbs.add(R.drawable.thumb5);
        images.add(R.drawable.wall5);

        captions.add("Item 6");
        thumbs.add(R.drawable.thumb6);
        images.add(R.drawable.wall6);

        captions.add("Item 7");
        thumbs.add(R.drawable.thumb7);
        images.add(R.drawable.wall7);

        captions.add("Item 8");
        thumbs.add(R.drawable.thumb8);
        images.add(R.drawable.wall8);

        captions.add("Item 9");
        thumbs.add(R.drawable.thumb9);
        images.add(R.drawable.wall9);

        captions.add("Item 10");
        thumbs.add(R.drawable.thumb10);
        images.add(R.drawable.wall10);

        LinearLayout layoutList = findViewById(R.id.layout_list);

        for (int i = 0; i < thumbs.size(); i++)
        {
            View itemView = getLayoutInflater().inflate(R.layout.custom_layout_item, null);
            ImageView imageThumb = itemView.findViewById(R.id.image_thumb);
            TextView textCaption = itemView.findViewById(R.id.text_caption);

            itemView.setId(i);

            imageThumb.setImageResource(thumbs.get(i));
            textCaption.setText(captions.get(i));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id = view.getId();
                    imageLarge.setImageResource(images.get(id));
                }
            });

            layoutList.addView(itemView);
        }
    }


}