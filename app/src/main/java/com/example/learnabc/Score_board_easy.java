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

public class Score_board_easy extends AppCompatActivity {
    TextView mPlayer1,mPlayer2,mPlayer3,mScore1,mScore2,mScore3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board_easy);
        mPlayer1=findViewById(R.id.tv_place_1_easy);
        mPlayer2=findViewById(R.id.tv_place_2_easy);
        mPlayer3=findViewById(R.id.tv_place_3_easy);
        mScore1=findViewById(R.id.tv_score_1_easy);
        mScore2=findViewById(R.id.tv_score_2_easy);
        mScore3=findViewById(R.id.tv_score_3_easy);

        if (player1.getScoreEasy() > player2.getScoreEasy()&&player1.getScoreEasy() > player3.getScoreEasy()&&player1.getScoreEasy() > player4.getScoreEasy()) {
            mPlayer1.setText("Player 1 ("+player1.getPlayerName()+")");
            mScore1.setText(player1.getScoreEasy()+"");
            if (player2.getScoreEasy() > player3.getScoreEasy()&&player2.getScoreEasy() > player4.getScoreEasy()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreEasy()+"");
                if (player3.getScoreEasy()>player4.getScoreEasy()){
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreEasy()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreEasy()+"");
                }
            }
            else if (player3.getScoreEasy()>player2.getScoreEasy()&&player3.getScoreEasy()>player4.getScoreEasy()){
                mPlayer2.setText("Player 3 ("+player3.getPlayerName()+")");
                mScore2.setText(player3.getScoreEasy()+"");
                if (player2.getScoreEasy()>player4.getScoreEasy()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreEasy()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreEasy()+"");
                }
            }

            else if(player4.getScoreEasy()>player2.getScoreEasy()&&player4.getScoreEasy()>player3.getScoreEasy()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreEasy());
                if (player2.getScoreEasy()>player3.getScoreEasy()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreEasy()+"");
                }else{
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreEasy()+"");
                }
            }

        }
        else if(player2.getScoreEasy() > player1.getScoreEasy()&&player2.getScoreEasy() > player3.getScoreEasy()&&player2.getScoreEasy() > player4.getScoreEasy()){
            mPlayer1.setText("Player 2 ("+player2.getPlayerName()+")");
            mScore1.setText(player2.getScoreEasy()+"");
            if (player1.getScoreEasy() > player3.getScoreEasy()&&player1.getScoreEasy() > player4.getScoreEasy()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreEasy());
                if (player3.getScoreEasy()>player4.getScoreEasy()){
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreEasy()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreEasy()+"");
                }
            }
            else if (player3.getScoreEasy()>player1.getScoreEasy()&&player3.getScoreEasy()>player4.getScoreEasy()){
                mPlayer2.setText("Player 3 ("+player3.getPlayerName()+")");
                mScore2.setText(player3.getScoreEasy()+"");
                if (player1.getScoreEasy()>player4.getScoreEasy()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreEasy()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreEasy()+"");
                }
            }
            else if(player4.getScoreEasy()>player1.getScoreEasy()&&player4.getScoreEasy()>player3.getScoreEasy()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreEasy());
                if (player1.getScoreEasy()>player3.getScoreEasy()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreEasy()+"");
                }else{
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreEasy()+"");
                }
            }
        }
        else if(player3.getScoreEasy() > player1.getScoreEasy()&&player3.getScoreEasy() > player2.getScoreEasy()&&player3.getScoreEasy() > player4.getScoreEasy()){
            mPlayer1.setText("Player 3 ("+player3.getPlayerName()+")");
            mScore1.setText(player3.getScoreEasy()+"");
            if (player1.getScoreEasy() > player2.getScoreEasy()&&player1.getScoreEasy() > player4.getScoreEasy()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreEasy()+"");
                if (player2.getScoreEasy()>player4.getScoreEasy()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreEasy()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreEasy()+"");
                }
            }
            else if (player2.getScoreEasy()>player1.getScoreEasy()&&player2.getScoreEasy()>player4.getScoreEasy()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreEasy()+"");
                if (player1.getScoreEasy()>player4.getScoreEasy()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreEasy()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreEasy()+"");
                }
            }
            else if(player4.getScoreEasy()>player1.getScoreEasy()&&player4.getScoreEasy()>player2.getScoreEasy()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreEasy());
                if (player1.getScoreEasy()>player2.getScoreEasy()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreEasy()+"");
                }else{
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreEasy()+"");
                }
            }
        }

        else if(player4.getScoreEasy() > player1.getScoreEasy()&&player4.getScoreEasy() > player2.getScoreEasy()&&player4.getScoreEasy() > player3.getScoreEasy()){

            mPlayer1.setText("Player 4 ("+player4.getPlayerName()+")");
            mScore1.setText(player4.getScoreEasy()+"");
            if (player1.getScoreEasy() > player2.getScoreEasy()&&player1.getScoreEasy() > player3.getScoreEasy()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreEasy()+"");
                if (player2.getScoreEasy()>player3.getScoreEasy()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreEasy()+"");
                }else {
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreEasy()+"");
                }
            }
            else if (player2.getScoreEasy()>player1.getScoreEasy()&&player2.getScoreEasy()>player3.getScoreEasy()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreEasy()+"");
                if (player1.getScoreEasy()>player3.getScoreEasy()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreEasy()+"");
                }else {
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreEasy()+"");
                }
            }
            else if(player3.getScoreEasy()>player1.getScoreEasy()&&player3.getScoreEasy()>player2.getScoreEasy()){
                mPlayer2.setText("Player 3("+player3.getPlayerName()+")");
                mPlayer2.setText(player3.getScoreEasy());
                if (player1.getScoreEasy()>player2.getScoreEasy()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreEasy()+"");
                }else{
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreEasy()+"");
                }
            }

        }

    }

    public void home(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
}
