package com.ilham.recyclerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewHolder> {

    private String[] titleList;
    private String[] descList;
    private Integer[] photoList;

    public MainAdapter(String[] titleList, String[] descList, Integer[] photoList, Context context) {
        this.titleList = titleList;
        this.descList = descList;
        this.photoList = photoList;
        this.context = context;
    }

    Context context;

    @NonNull
    @Override
    public MainAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_main, parent, false);
        final MainAdapter.viewHolder viewHolder = new MainAdapter.viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.viewHolder holder, int i) {
        holder.title.setText(titleList[i]);
        holder.desc.setText(descList[i]);
        Glide.with(context)
                .load(photoList[i])
                .apply(new RequestOptions())
                .into(holder.photo);
    }

    @Override
    public int getItemCount() {
        return titleList.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView title, desc;
        ImageView photo;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tvTitle);
            desc = itemView.findViewById(R.id.tvDesc);
            photo = itemView.findViewById(R.id.ivPhoto);

        }
    }
}
