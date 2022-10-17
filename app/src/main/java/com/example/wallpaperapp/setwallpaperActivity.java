package com.example.wallpaperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.Toast;

import com.example.wallpaperapp.databinding.ActivitySetwallpaperBinding;

import java.io.IOException;

public class setwallpaperActivity extends AppCompatActivity {
// using binding 
    ActivitySetwallpaperBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySetwallpaperBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //now get image using intent
        Intent intent = getIntent();
        int image = intent.getIntExtra("image",0);
        binding.wallimage.setImageResource(image);

        binding.setwallpaper.setOnClickListener(v->{
            Bitmap bitmap = ((BitmapDrawable)binding.wallimage.getDrawable()).getBitmap();
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
            try {
                wallpaperManager.setBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Toast.makeText(this, "Wallpaper set", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}