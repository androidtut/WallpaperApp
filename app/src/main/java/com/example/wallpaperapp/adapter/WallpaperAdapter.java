package com.example.wallpaperapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wallpaperapp.R;
import com.example.wallpaperapp.models.WallpaperModels;

import java.util.ArrayList;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.ViewHolder>{
    ArrayList<WallpaperModels>wlist;
    Context context;

    public WallpaperAdapter(ArrayList<WallpaperModels> wlist, Context context) {
        this.wlist = wlist;
        this.context = context;
    }

    public void filteradapter(ArrayList<WallpaperModels>filterlist){
        this.wlist = filterlist;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.wallpaper_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     final WallpaperModels models = wlist.get(position);
     holder.imageView.setImageResource(models.getImage());
    }

    @Override
    public int getItemCount() {
        return wlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
       ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.wallpaperimg);
        }
    }
}
