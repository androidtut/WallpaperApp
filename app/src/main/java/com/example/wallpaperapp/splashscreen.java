package com.example.wallpaperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5*1000);
                    startActivity(new Intent(splashscreen.this,MainActivity.class));
                    finish();
                }catch(Exception e){
                    e.printStackTrace();
                }
                super.run();
            }
        };thread.start();
    }
}