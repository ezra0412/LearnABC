package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level extends AppCompatActivity {
    public static int level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }

    public void easy(View view){  level =1;startActivity(new Intent(this,Test_easy.class));
    }
    public void medium(View view){
         level =2;
        startActivity(new Intent(this,Test_medium.class));
    }
    public void hard(View view){
         level=3;
        startActivity(new Intent(this,Test_hard.class));
    }
    public void back(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
    public static int getLevel(){
        return level;
    }
}
