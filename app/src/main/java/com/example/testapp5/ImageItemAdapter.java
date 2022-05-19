package com.example.testapp5;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageItemAdapter extends BaseAdapter {

    Context context;
    Integer[] thumbs;
    int width;

    public ImageItemAdapter(Context context, Integer[] thumbs) {
        this.context = context;
        this.thumbs = thumbs;

        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        width = displayMetrics.widthPixels;
        Log.v("TAG", "width: " + width);
    }

    @Override
    public int getCount() {
        return thumbs.length;
    }

    @Override
    public Object getItem(int i) {
        return thumbs[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view == null)
        {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(width/3, width/3));
            imageView.setPadding(4, 4, 4, 4);
        } else
            imageView = (ImageView) view;

        imageView.setImageResource(thumbs[i]);

        return imageView;
    }
}
