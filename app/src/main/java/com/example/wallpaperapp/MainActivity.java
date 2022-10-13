package com.example.wallpaperapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.wallpaperapp.adapter.WallpaperAdapter;
import com.example.wallpaperapp.databinding.ActivityMainBinding;
import com.example.wallpaperapp.models.WallpaperModels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<WallpaperModels>wlist;
    GridLayoutManager gridLayoutManager;
    ActivityMainBinding binding;
    WallpaperAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adddatatorecyclerview();
    }

    private void adddatatorecyclerview() {
        wlist = new ArrayList<>();
        wlist.add(new WallpaperModels(1,"nature",R.drawable.nature1));
        wlist.add(new WallpaperModels(2,"nature",R.drawable.nature2));
        wlist.add(new WallpaperModels(3,"nature",R.drawable.nature3));
        wlist.add(new WallpaperModels(4,"nature",R.drawable.nature4));
        wlist.add(new WallpaperModels(5,"nature",R.drawable.nature5));
        wlist.add(new WallpaperModels(6,"car",R.drawable.car1));
        wlist.add(new WallpaperModels(7,"car",R.drawable.car2));
        wlist.add(new WallpaperModels(8,"car",R.drawable.car3));
        wlist.add(new WallpaperModels(9,"car",R.drawable.car4));
        wlist.add(new WallpaperModels(10,"train",R.drawable.train1));
        wlist.add(new WallpaperModels(11,"train",R.drawable.train2));
        wlist.add(new WallpaperModels(12,"trending",R.drawable.nature3));
        wlist.add(new WallpaperModels(13,"trending",R.drawable.nature4));
        wlist.add(new WallpaperModels(14,"trending",R.drawable.car4));
        wlist.add(new WallpaperModels(15,"trending",R.drawable.car3));
        wlist.add(new WallpaperModels(16,"trending",R.drawable.train2));
        wlist.add(new WallpaperModels(17,"trending",R.drawable.train1));

        adapter = new WallpaperAdapter(wlist,this);
        binding.wallpaperrecyclerview.setAdapter(adapter);

        binding.wallpaperrecyclerview.setLayoutManager(new GridLayoutManager(this,2));
    }
}