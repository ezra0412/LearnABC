package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScoreBoard_level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board_level);
    }

    public void easy(View view){
        startActivity(new Intent(this,Score_board_easy.class));
    }

    public void medium(View view){
        startActivity(new Intent(this,Score_board_medium.class));
    }

    public void hard(View view){
        startActivity(new Intent(this,Score_board_hard.class));
    }

    public void back(View view){startActivity(new Intent(this,MainActivity.class));}
}
