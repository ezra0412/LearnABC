package com.example.learnabc;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle saveInstaceState){
        super.onCreate(saveInstaceState);
        startActivity(new Intent(this,MainActivity.class));
    }
}
