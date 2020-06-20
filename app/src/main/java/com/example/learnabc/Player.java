package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Player extends AppCompatActivity {
    public final static int REQUEST_CODE = 1;
    Button bt_player1;
    Button bt_player2;
    Button bt_player3;
    Button bt_player4;
    TextView playerID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        bt_player1 = (Button) findViewById(R.id.bt_player1);
        bt_player2 = (Button) findViewById(R.id.bt_player2);
        bt_player3 = (Button) findViewById(R.id.bt_player3);
        bt_player4 = (Button) findViewById(R.id.bt_player4);
        playerID = (TextView) findViewById(R.id.tv_player);

    }

    public void setBt_player1player1(View view){
        bt_player1.setEnabled(false);
        bt_player2.setEnabled(true);
        bt_player3.setEnabled(true);
        bt_player4.setEnabled(true);
        Toast.makeText(Player.this, "Player 1 selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.putExtra("chosenPlayer", 1);
        setResult(RESULT_OK, intent);
        finish();
    }



    public void setBt_player1player2(View view){
        bt_player1.setEnabled(true);
        bt_player2.setEnabled(false);
        bt_player3.setEnabled(true);
        bt_player4.setEnabled(true);
        Toast.makeText(Player.this, "Player 2 selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.putExtra("chosenPlayer", 2);
        setResult(RESULT_OK,intent);
        finish();

    }

    public void setBt_player1player3(View view){
        bt_player1.setEnabled(true);
        bt_player2.setEnabled(true);
        bt_player3.setEnabled(false);
        bt_player4.setEnabled(true);
        Toast.makeText(Player.this, "Player 3 selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.putExtra("chosenPlayer", 3);
        setResult(RESULT_OK,intent);
        finish();
    }

    public void setBt_player1player4(View view){
        bt_player1.setEnabled(true);
        bt_player2.setEnabled(true);
        bt_player3.setEnabled(true);
        bt_player4.setEnabled(false);
        Toast.makeText(Player.this, "Player 4 selected", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.putExtra("chosenPlayer", 4);
        setResult(RESULT_OK,intent);
        finish();
    }

    public void back(View view){
        super.onBackPressed();
    }
}
