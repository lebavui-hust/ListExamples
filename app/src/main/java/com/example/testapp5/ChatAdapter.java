package com.example.testapp5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChatAdapter extends BaseAdapter {

    List<ChatModel> items;

    public ChatAdapter(List<ChatModel> items) {
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
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position).isMe())
            return 1;
        else
            return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyViewHolder viewHolder;
        if (view == null) {
            if (getItemViewType(i) == 0)
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_left, null);
            else
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_right, null);

            viewHolder = new MyViewHolder();
            viewHolder.imageThumb = view.findViewById(R.id.image_thumb);
            viewHolder.textMessage = view.findViewById(R.id.text_message);
            view.setTag(viewHolder);
        } else
            viewHolder = (MyViewHolder) view.getTag();

        ChatModel item = items.get(i);
        viewHolder.textMessage.setText(item.getCaption());
        viewHolder.imageThumb.setImageResource(item.getThumb());

        return view;
    }

    class MyViewHolder {
        ImageView imageThumb;
        TextView textMessage;
    }
}
