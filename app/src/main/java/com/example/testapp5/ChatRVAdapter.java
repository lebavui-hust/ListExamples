package com.example.testapp5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ChatModel> items;

    public ChatRVAdapter(List<ChatModel> items) {
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position).isMe())
            return 1;
        else
            return 0;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_left, parent, false);
            return new MyViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_right, parent, false);
            return new MyViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ChatModel item = items.get(position);
        ((MyViewHolder)holder).textMessage.setText(item.getCaption());
        ((MyViewHolder)holder).imageThumb.setImageResource(item.getThumb());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textMessage;
        ImageView imageThumb;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textMessage = itemView.findViewById(R.id.text_message);
            imageThumb = itemView.findViewById(R.id.image_thumb);
        }
    }
}
