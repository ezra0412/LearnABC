package com.example.learnabc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_player;
    static PlayerDetails player1 =new PlayerDetails("",0);
    static PlayerDetails player2 =new PlayerDetails("",0);
    static PlayerDetails player3 =new PlayerDetails("",0);
    static PlayerDetails player4 =new PlayerDetails("",0);
    static int currerntPlayer=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_player=(TextView) findViewById(R.id.tv_player);
        if (currerntPlayer==1){
            tv_player.setText("Player 1");
        }
        else if (currerntPlayer==2){
            tv_player.setText("Player 2");
        }
        else if (currerntPlayer==3){
            tv_player.setText("Player 3");
        }
        else if (currerntPlayer==4){
            tv_player.setText("Player 4");
        }
    }



    public void startLearning(View view){
        startActivity(new Intent(MainActivity.this,Learn.class));
    }

    public void startTest(View view){
        startActivity(new Intent(MainActivity.this,Level.class));
    }

    public void changePlayer(View view){
        Intent intent=new Intent(MainActivity.this,Player.class);
        startActivityForResult(intent,1);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == RESULT_OK){
                int result = data.getIntExtra("chosenPlayer",0);
                if (result==1){
                    tv_player.setText("Player 1");
                    currerntPlayer=1;
                }

                else if (result==2){
                    tv_player.setText("Player 2");
                    currerntPlayer=2;
                }

                else if (result==3){
                    tv_player.setText("Player 3");
                    currerntPlayer=3;
                }

                else if (result==4){
                    tv_player.setText("Player 4");
                    currerntPlayer=4;
                }
            }

            if(resultCode == RESULT_CANCELED){
                tv_player.setText("Player 1");
            }
        }
    }

    public void scoreBoard(View view){
        startActivity(new Intent(this,ScoreBoard.class));
    }

    public static int getCurrerntPlayer(){
        return currerntPlayer;
    }


}

