package com.example.testapp5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ItemModel> items;

    public HorizontalAdapter(List<ItemModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_item, parent, false);
        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemModel item = items.get(position);
        HorizontalViewHolder viewHolder = (HorizontalViewHolder) holder;
        viewHolder.textCaption.setText(item.getCaption());
        viewHolder.imageThumb.setImageResource(item.getThumb());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class HorizontalViewHolder extends RecyclerView.ViewHolder {

        TextView textCaption;
        ImageView imageThumb;

        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);

            textCaption = itemView.findViewById(R.id.text_caption);
            imageThumb = itemView.findViewById(R.id.image_thumb);
        }
    }
}
