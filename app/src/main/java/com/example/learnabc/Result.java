package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.learnabc.MainActivity.getCurrerntPlayer;
import static com.example.learnabc.MainActivity.player1;
import static com.example.learnabc.MainActivity.player2;
import static com.example.learnabc.MainActivity.player3;
import static com.example.learnabc.MainActivity.player4;


public class Result extends AppCompatActivity {
    TextView score,player;
    EditText mName;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        score=findViewById(R.id.tv_score_result);
        player=findViewById(R.id.tv_currectPlayer_result);
        mName=findViewById(R.id.et_name_result);
        Intent intent = getIntent();
        result= intent.getIntExtra("result",0);
        score.setText(result+"");
        if(getCurrerntPlayer()==1){
            player.setText("Player 1");
        }
        else if(getCurrerntPlayer()==2){
            player.setText("Player 2");

        }
        else if(getCurrerntPlayer()==3){
            player.setText("Player 3");

        }
        else if(getCurrerntPlayer()==4){
            player.setText("Player 4");

        }

    }

    public void done(View view){
        String name= mName.getText().toString();
        if(getCurrerntPlayer()==1){
            player1.setCorrectAns(result);
            player1.setPlayerName(name);
            player.setText("Player 1");
        }
        else if(getCurrerntPlayer()==2){
            player2.setCorrectAns(result);
            player2.setPlayerName(name);
            player.setText("Player 2");

        }
        else if(getCurrerntPlayer()==3){
            player3.setCorrectAns(result);
            player3.setPlayerName(name);
            player.setText("Player 3");

        }
        else if(getCurrerntPlayer()==4){
            player4.setCorrectAns(result);
            player4.setPlayerName(name);
            player.setText("Player 4");

        }

        startActivity(new Intent(this,ScoreBoard.class));
    }

}
