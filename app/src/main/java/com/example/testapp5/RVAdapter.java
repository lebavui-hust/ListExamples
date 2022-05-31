package com.example.testapp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<ItemModel> items;
    ItemClickInterface itemClickInterface;

    public RVAdapter(List<ItemModel> items, ItemClickInterface clickInterface) {
        this.items = items;
        this.itemClickInterface = clickInterface;
    }

//    public RVAdapter(List<ItemModel> items) {
//        this.items = items;
//    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_left, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemModel item = items.get(position);
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

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if (itemClickInterface != null)
                        itemClickInterface.OnItemClick(pos);
                }
            });
        }
    }

    public interface ItemClickInterface {
        void OnItemClick(int position);
    }
}
