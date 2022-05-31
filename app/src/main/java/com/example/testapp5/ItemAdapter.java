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
        MyViewHolder viewHolder;

        if (view == null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.custom_layout_item_2, null);
            viewHolder = new MyViewHolder();
            viewHolder.imageThumb = view.findViewById(R.id.image_thumb);
            viewHolder.textCaption = view.findViewById(R.id.text_caption);
            viewHolder.checkSelected = view.findViewById(R.id.check_selected);
            view.setTag(viewHolder);
        } else
            viewHolder = (MyViewHolder) view.getTag();

        ItemModel item = items.get(i);
        viewHolder.imageThumb.setImageResource(item.getThumb());
        viewHolder.textCaption.setText(item.getCaption());
        viewHolder.checkSelected.setChecked(item.isChecked());

        viewHolder.checkSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setChecked(viewHolder.checkSelected.isChecked());
                notifyDataSetChanged();
            }
        });

        return view;
    }

    class MyViewHolder {
        ImageView imageThumb;
        TextView textCaption;
        CheckBox checkSelected;
    }
}
