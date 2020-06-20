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

public class Score_board_hard extends AppCompatActivity {
    TextView mPlayer1,mPlayer2,mPlayer3,mScore1,mScore2,mScore3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board_hard);
        mPlayer1=findViewById(R.id.tv_place_1_hard);
        mPlayer2=findViewById(R.id.tv_place_2_hard);
        mPlayer3=findViewById(R.id.tv_place_3_hard);
        mScore1=findViewById(R.id.tv_score_1_hard);
        mScore2=findViewById(R.id.tv_score_2_hard);
        mScore3=findViewById(R.id.tv_score_3_hard);

        if (player1.getScoreHard() > player2.getScoreHard()&&player1.getScoreHard() > player3.getScoreHard()&&player1.getScoreHard() > player4.getScoreHard()) {
            mPlayer1.setText("Player 1 ("+player1.getPlayerName()+")");
            mScore1.setText(player1.getScoreHard()+"");
            if (player2.getScoreHard() > player3.getScoreHard()&&player2.getScoreHard() > player4.getScoreHard()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreHard()+"");
                if (player3.getScoreHard()>player4.getScoreHard()){
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreHard()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreHard()+"");
                }
            }
            else if (player3.getScoreHard()>player2.getScoreHard()&&player3.getScoreHard()>player4.getScoreHard()){
                mPlayer2.setText("Player 3 ("+player3.getPlayerName()+")");
                mScore2.setText(player3.getScoreHard()+"");
                if (player2.getScoreHard()>player4.getScoreHard()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreHard()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreHard()+"");
                }
            }

            else if(player4.getScoreHard()>player2.getScoreHard()&&player4.getScoreHard()>player3.getScoreHard()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreHard());
                if (player2.getScoreHard()>player3.getScoreHard()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreHard()+"");
                }else{
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreHard()+"");
                }
            }

        }
        else if(player2.getScoreHard() > player1.getScoreHard()&&player2.getScoreHard() > player3.getScoreHard()&&player2.getScoreHard() > player4.getScoreHard()){
            mPlayer1.setText("Player 2 ("+player2.getPlayerName()+")");
            mScore1.setText(player2.getScoreHard()+"");
            if (player1.getScoreHard() > player3.getScoreHard()&&player1.getScoreHard() > player4.getScoreHard()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreHard());
                if (player3.getScoreHard()>player4.getScoreHard()){
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreHard()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreHard()+"");
                }
            }
            else if (player3.getScoreHard()>player1.getScoreHard()&&player3.getScoreHard()>player4.getScoreHard()){
                mPlayer2.setText("Player 3 ("+player3.getPlayerName()+")");
                mScore2.setText(player3.getScoreHard()+"");
                if (player1.getScoreHard()>player4.getScoreHard()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreHard()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreHard()+"");
                }
            }
            else if(player4.getScoreHard()>player1.getScoreHard()&&player4.getScoreHard()>player3.getScoreHard()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreHard());
                if (player1.getScoreHard()>player3.getScoreHard()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreHard()+"");
                }else{
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreHard()+"");
                }
            }
        }
        else if(player3.getScoreHard() > player1.getScoreHard()&&player3.getScoreHard() > player2.getScoreHard()&&player3.getScoreHard() > player4.getScoreHard()){
            mPlayer1.setText("Player 3 ("+player3.getPlayerName()+")");
            mScore1.setText(player3.getScoreHard()+"");
            if (player1.getScoreHard() > player2.getScoreHard()&&player1.getScoreHard() > player4.getScoreHard()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreHard()+"");
                if (player2.getScoreHard()>player4.getScoreHard()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreHard()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreHard()+"");
                }
            }
            else if (player2.getScoreHard()>player1.getScoreHard()&&player2.getScoreHard()>player4.getScoreHard()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreHard()+"");
                if (player1.getScoreHard()>player4.getScoreHard()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreHard()+"");
                }else {
                    mPlayer3.setText("Player 4 ("+player4.getPlayerName()+")");
                    mScore3.setText(player4.getScoreHard()+"");
                }
            }
            else if(player4.getScoreHard()>player1.getScoreHard()&&player4.getScoreHard()>player2.getScoreHard()){
                mPlayer2.setText("Player 4("+player4.getPlayerName()+")");
                mPlayer2.setText(player4.getScoreHard());
                if (player1.getScoreHard()>player2.getScoreHard()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreHard()+"");
                }else{
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreHard()+"");
                }
            }
        }

        else if(player4.getScoreHard() > player1.getScoreHard()&&player4.getScoreHard() > player2.getScoreHard()&&player4.getScoreHard() > player3.getScoreHard()){

            mPlayer1.setText("Player 4 ("+player4.getPlayerName()+")");
            mScore1.setText(player4.getScoreHard()+"");
            if (player1.getScoreHard() > player2.getScoreHard()&&player1.getScoreHard() > player3.getScoreHard()){
                mPlayer2.setText("Player 1 ("+player1.getPlayerName()+")");
                mScore2.setText(player1.getScoreHard()+"");
                if (player2.getScoreHard()>player3.getScoreHard()){
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreHard()+"");
                }else {
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreHard()+"");
                }
            }
            else if (player2.getScoreHard()>player1.getScoreHard()&&player2.getScoreHard()>player3.getScoreHard()){
                mPlayer2.setText("Player 2 ("+player2.getPlayerName()+")");
                mScore2.setText(player2.getScoreHard()+"");
                if (player1.getScoreHard()>player3.getScoreHard()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreHard()+"");
                }else {
                    mPlayer3.setText("Player 3 ("+player3.getPlayerName()+")");
                    mScore3.setText(player3.getScoreHard()+"");
                }
            }
            else if(player3.getScoreHard()>player1.getScoreHard()&&player3.getScoreHard()>player2.getScoreHard()){
                mPlayer2.setText("Player 3("+player3.getPlayerName()+")");
                mPlayer2.setText(player3.getScoreHard());
                if (player1.getScoreHard()>player2.getScoreHard()){
                    mPlayer3.setText("Player 1 ("+player1.getPlayerName()+")");
                    mScore3.setText(player1.getScoreHard()+"");
                }else{
                    mPlayer3.setText("Player 2 ("+player2.getPlayerName()+")");
                    mScore3.setText(player2.getScoreHard()+"");
                }
            }

        }

    }

    public void home(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
}
