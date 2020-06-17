package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.learnabc.MainActivity.player1;
import static com.example.learnabc.MainActivity.player2;
import static com.example.learnabc.MainActivity.player3;
import static com.example.learnabc.MainActivity.player4;

public class ScoreBoard extends AppCompatActivity {
    TextView mPlayer1,mPlayer2,mPlayer3,mScore1,mScore2,mScore3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        mPlayer1=findViewById(R.id.tv_place_1);
        mPlayer2=findViewById(R.id.tv_place_2);
        mPlayer3=findViewById(R.id.tv_place_3);
        mScore1=findViewById(R.id.tv_score_1);
        mScore2=findViewById(R.id.tv_score_2);
        mScore3=findViewById(R.id.tv_score_3);
//Still need debug
        if (player1.getCorrectAns() > player2.getCorrectAns()&&player1.getCorrectAns() > player3.getCorrectAns()&&player1.getCorrectAns() > player4.getCorrectAns()) {
            mPlayer1.setText("Player 1 ("+player1.getPlayerName()+")");
            mScore1.setText(player1.getCorrectAns()+"");
            if (player2.getCorrectAns() > player3.getCorrectAns()&&player2.getCorrectAns() > player4.getCorrectAns()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getCorrectAns()+"");
                if (player3.getCorrectAns()>player4.getCorrectAns()){
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getCorrectAns()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getCorrectAns()+"");
                }
            }
            else if (player3.getCorrectAns()>player2.getCorrectAns()&&player3.getCorrectAns()>player4.getCorrectAns()){
                mPlayer2.setText("Player 3 ("+player3.getPlayerName()+")");
                mScore2.setText(player3.getCorrectAns()+"");
                if (player2.getCorrectAns()>player4.getCorrectAns()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getCorrectAns()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getCorrectAns()+"");
                }
            }

            else if(player4.getCorrectAns()>player2.getCorrectAns()&&player4.getCorrectAns()>player3.getCorrectAns()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getCorrectAns());
                if (player2.getCorrectAns()>player3.getCorrectAns()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getCorrectAns()+"");
                }else{
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getCorrectAns()+"");
                }
            }

        }
        else if(player2.getCorrectAns() > player1.getCorrectAns()&&player2.getCorrectAns() > player3.getCorrectAns()&&player2.getCorrectAns() > player4.getCorrectAns()){
            mPlayer1.setText("Player 2 ("+player2.getPlayerName()+")");
            mScore1.setText(player2.getCorrectAns()+"");
            if (player1.getCorrectAns() > player3.getCorrectAns()&&player1.getCorrectAns() > player4.getCorrectAns()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getCorrectAns());
                if (player3.getCorrectAns()>player4.getCorrectAns()){
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getCorrectAns()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getCorrectAns()+"");
                }
            }
            else if (player3.getCorrectAns()>player1.getCorrectAns()&&player3.getCorrectAns()>player4.getCorrectAns()){
                mPlayer2.setText("Player 3 ("+player3.getPlayerName()+")");
                mScore2.setText(player3.getCorrectAns()+"");
                if (player1.getCorrectAns()>player4.getCorrectAns()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getCorrectAns()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getCorrectAns()+"");
                }
            }
            else if(player4.getCorrectAns()>player1.getCorrectAns()&&player4.getCorrectAns()>player3.getCorrectAns()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getCorrectAns());
                if (player1.getCorrectAns()>player3.getCorrectAns()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getCorrectAns()+"");
                }else{
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getCorrectAns()+"");
                }
            }
        }
        else if(player3.getCorrectAns() > player1.getCorrectAns()&&player3.getCorrectAns() > player2.getCorrectAns()&&player3.getCorrectAns() > player4.getCorrectAns()){
            mPlayer1.setText("Player 3 ("+player3.getPlayerName()+")");
            mScore1.setText(player3.getCorrectAns()+"");
            if (player1.getCorrectAns() > player2.getCorrectAns()&&player1.getCorrectAns() > player4.getCorrectAns()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getCorrectAns()+"");
                if (player2.getCorrectAns()>player4.getCorrectAns()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getCorrectAns()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getCorrectAns()+"");
                }
            }
            else if (player2.getCorrectAns()>player1.getCorrectAns()&&player2.getCorrectAns()>player4.getCorrectAns()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getCorrectAns()+"");
                if (player1.getCorrectAns()>player4.getCorrectAns()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getCorrectAns()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getCorrectAns()+"");
                }
            }
            else if(player4.getCorrectAns()>player1.getCorrectAns()&&player4.getCorrectAns()>player2.getCorrectAns()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getCorrectAns());
                if (player1.getCorrectAns()>player2.getCorrectAns()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getCorrectAns()+"");
                }else{
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getCorrectAns()+"");
                }
            }
        }

        else if(player4.getCorrectAns() > player1.getCorrectAns()&&player4.getCorrectAns() > player2.getCorrectAns()&&player4.getCorrectAns() > player3.getCorrectAns()){

            mPlayer1.setText("Player 4 ("+player4.getPlayerName()+")");
            mScore1.setText(player4.getCorrectAns()+"");
            if (player1.getCorrectAns() > player2.getCorrectAns()&&player1.getCorrectAns() > player3.getCorrectAns()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getCorrectAns()+"");
                if (player2.getCorrectAns()>player3.getCorrectAns()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getCorrectAns()+"");
                }else {
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getCorrectAns()+"");
                }
            }
            else if (player2.getCorrectAns()>player1.getCorrectAns()&&player2.getCorrectAns()>player3.getCorrectAns()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getCorrectAns()+"");
                if (player1.getCorrectAns()>player3.getCorrectAns()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getCorrectAns()+"");
                }else {
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getCorrectAns()+"");
                }
            }
            else if(player3.getCorrectAns()>player1.getCorrectAns()&&player3.getCorrectAns()>player2.getCorrectAns()){
                mPlayer2.setText("Player 3("+player3.getPlayerName()+")");
                mPlayer2.setText(player3.getCorrectAns());
                if (player1.getCorrectAns()>player2.getCorrectAns()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getCorrectAns()+"");
                }else{
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getCorrectAns()+"");
                }
            }

        }

    }

    public void home(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
}
