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

public class Score_board_medium extends AppCompatActivity {
    TextView mPlayer1,mPlayer2,mPlayer3,mScore1,mScore2,mScore3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board_medium);
        mPlayer1=findViewById(R.id.tv_place_1_medium);
        mPlayer2=findViewById(R.id.tv_place_2_medium);
        mPlayer3=findViewById(R.id.tv_place_3_medium);
        mScore1=findViewById(R.id.tv_score_1_medium);
        mScore2=findViewById(R.id.tv_score_2_medium);
        mScore3=findViewById(R.id.tv_score_3_medium);

        if (player1.getScoreMedium() > player2.getScoreMedium()&&player1.getScoreMedium() > player3.getScoreMedium()&&player1.getScoreMedium() > player4.getScoreMedium()) {
            mPlayer1.setText("Player 1 ("+player1.getPlayerName()+")");
            mScore1.setText(player1.getScoreMedium()+"");
            if (player2.getScoreMedium() > player3.getScoreMedium()&&player2.getScoreMedium() > player4.getScoreMedium()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreMedium()+"");
                if (player3.getScoreMedium()>player4.getScoreMedium()){
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreMedium()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreMedium()+"");
                }
            }
            else if (player3.getScoreMedium()>player2.getScoreMedium()&&player3.getScoreMedium()>player4.getScoreMedium()){
                mPlayer2.setText("Player 3 ("+player3.getPlayerName()+")");
                mScore2.setText(player3.getScoreMedium()+"");
                if (player2.getScoreMedium()>player4.getScoreMedium()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreMedium()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreMedium()+"");
                }
            }

            else if(player4.getScoreMedium()>player2.getScoreMedium()&&player4.getScoreMedium()>player3.getScoreMedium()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreMedium());
                if (player2.getScoreMedium()>player3.getScoreMedium()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreMedium()+"");
                }else{
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreMedium()+"");
                }
            }

        }
        else if(player2.getScoreMedium() > player1.getScoreMedium()&&player2.getScoreMedium() > player3.getScoreMedium()&&player2.getScoreMedium() > player4.getScoreMedium()){
            mPlayer1.setText("Player 2 ("+player2.getPlayerName()+")");
            mScore1.setText(player2.getScoreMedium()+"");
            if (player1.getScoreMedium() > player3.getScoreMedium()&&player1.getScoreMedium() > player4.getScoreMedium()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreMedium());
                if (player3.getScoreMedium()>player4.getScoreMedium()){
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreMedium()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreMedium()+"");
                }
            }
            else if (player3.getScoreMedium()>player1.getScoreMedium()&&player3.getScoreMedium()>player4.getScoreMedium()){
                mPlayer2.setText("Player 3 ("+player3.getPlayerName()+")");
                mScore2.setText(player3.getScoreMedium()+"");
                if (player1.getScoreMedium()>player4.getScoreMedium()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreMedium()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreMedium()+"");
                }
            }
            else if(player4.getScoreMedium()>player1.getScoreMedium()&&player4.getScoreMedium()>player3.getScoreMedium()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreMedium());
                if (player1.getScoreMedium()>player3.getScoreMedium()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreMedium()+"");
                }else{
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreMedium()+"");
                }
            }
        }
        else if(player3.getScoreMedium() > player1.getScoreMedium()&&player3.getScoreMedium() > player2.getScoreMedium()&&player3.getScoreMedium() > player4.getScoreMedium()){
            mPlayer1.setText("Player 3 ("+player3.getPlayerName()+")");
            mScore1.setText(player3.getScoreMedium()+"");
            if (player1.getScoreMedium() > player2.getScoreMedium()&&player1.getScoreMedium() > player4.getScoreMedium()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreMedium()+"");
                if (player2.getScoreMedium()>player4.getScoreMedium()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreMedium()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreMedium()+"");
                }
            }
            else if (player2.getScoreMedium()>player1.getScoreMedium()&&player2.getScoreMedium()>player4.getScoreMedium()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreMedium()+"");
                if (player1.getScoreMedium()>player4.getScoreMedium()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreMedium()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreMedium()+"");
                }
            }
            else if(player4.getScoreMedium()>player1.getScoreMedium()&&player4.getScoreMedium()>player2.getScoreMedium()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreMedium());
                if (player1.getScoreMedium()>player2.getScoreMedium()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreMedium()+"");
                }else{
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreMedium()+"");
                }
            }
        }

        else if(player4.getScoreMedium() > player1.getScoreMedium()&&player4.getScoreMedium() > player2.getScoreMedium()&&player4.getScoreMedium() > player3.getScoreMedium()){

            mPlayer1.setText("Player 4 ("+player4.getPlayerName()+")");
            mScore1.setText(player4.getScoreMedium()+"");
            if (player1.getScoreMedium() > player2.getScoreMedium()&&player1.getScoreMedium() > player3.getScoreMedium()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreMedium()+"");
                if (player2.getScoreMedium()>player3.getScoreMedium()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreMedium()+"");
                }else {
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreMedium()+"");
                }
            }
            else if (player2.getScoreMedium()>player1.getScoreMedium()&&player2.getScoreMedium()>player3.getScoreMedium()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreMedium()+"");
                if (player1.getScoreMedium()>player3.getScoreMedium()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreMedium()+"");
                }else {
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreMedium()+"");
                }
            }
            else if(player3.getScoreMedium()>player1.getScoreMedium()&&player3.getScoreMedium()>player2.getScoreMedium()){
                mPlayer2.setText("Player 3("+player3.getPlayerName()+")");
                mPlayer2.setText(player3.getScoreMedium());
                if (player1.getScoreMedium()>player2.getScoreMedium()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreMedium()+"");
                }else{
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreMedium()+"");
                }
            }

        }

    }

    public void home(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
}
