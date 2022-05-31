package com.example.testapp5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VerticalAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<List<ItemModel>> itemss;

    public VerticalAdapter(List<List<ItemModel>> itemss) {
        this.itemss = itemss;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_list, parent, false);
        return new VerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        List<ItemModel> items = itemss.get(position);

        HorizontalAdapter adapter = new HorizontalAdapter(items);
        ((VerticalViewHolder)holder).recyclerView.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return itemss.size();
    }

    class VerticalViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;

        public VerticalViewHolder(@NonNull View itemView) {
            super(itemView);

            recyclerView = itemView.findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));

//            HorizontalAdapter adapter = new HorizontalAdapter(itemss.get(getAdapterPosition()));
//            recyclerView.setAdapter(adapter);
        }
    }
}
