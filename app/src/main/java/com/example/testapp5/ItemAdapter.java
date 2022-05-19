package com.example.testapp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    Context context;
    List<ItemModel> items;

    public ItemAdapter(Context context, List<ItemModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.custom_layout_item_2, null);
        }

        ImageView imageThumb = view.findViewById(R.id.image_thumb);
        TextView textCaption = view.findViewById(R.id.text_caption);
        CheckBox checkSelected = view.findViewById(R.id.check_selected);

        ItemModel item = items.get(i);
        imageThumb.setImageResource(item.getThumb());
        textCaption.setText(item.getCaption());
        checkSelected.setChecked(item.isChecked());

        checkSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setChecked(checkSelected.isChecked());
                notifyDataSetChanged();
            }
        });

        return view;
    }
}
