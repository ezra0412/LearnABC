package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Test_hard extends AppCompatActivity {
    MediaPlayer character, question,correct,incorrect;
    TextView  questionNum;
    Button bt1, bt2, bt3, bt4;
    int num1, num2, num3, randA, choice, answer, counter = 0, answerCorrectly;
    int[] randomQ = new int[26];
    boolean answerMade = false;
    static char answerChar;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_hard);
        correct=MediaPlayer.create(this,R.raw.correct);
        incorrect=MediaPlayer.create(this,R.raw.incorrect);
        myDialog = new Dialog(this);
        bt1 = findViewById(R.id.bt_ans1_testEasy);
        bt2 = findViewById(R.id.bt_ans2_testEasy);
        bt3 = findViewById(R.id.bt_ans3_testEasy);
        bt4 = findViewById(R.id.bt_ans4_testEasy);
        questionNum = findViewById(R.id.tv_question_num_testEasy);
        question = MediaPlayer.create(this, R.raw.hard_question);

        ArrayList<Integer> randQL = new ArrayList<Integer>();
        for (int i = 0; i < 26; i++) {
            randQL.add(i, i + 1);
        }
        Collections.shuffle(randQL);
        for (int i = 0; i < 26; i++) {
            randomQ[i] = randQL.get(i);
        }
        test();
    }

    public int questionA() {
        character = MediaPlayer.create(this, R.raw.a);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 1) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;
        if (randA == 1) {
            bt1.setText("A");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("A");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("A");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("A");
            return 4;
        }

    }

    public int questionB() {
        character = MediaPlayer.create(this, R.raw.b);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 2) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("B");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("B");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("B");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("B");
            return 4;
        }
    }

    public int questionC() {
        character = MediaPlayer.create(this, R.raw.c);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 3) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("C");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("C");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("C");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("C");
            return 4;
        }
    }

    public int questionD() {
        character = MediaPlayer.create(this, R.raw.d);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 4) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("D");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("D");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("D");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("D");
            return 4;
        }
    }

    public int questionE() {
        character = MediaPlayer.create(this, R.raw.e);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 5) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("E");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("E");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("E");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("E");
            return 4;
        }
    }

    public int questionF() {
        character = MediaPlayer.create(this, R.raw.f);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 6) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("F");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("F");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("F");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("F");
            return 4;
        }
    }

    public int questionG() {
        character = MediaPlayer.create(this, R.raw.g);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 7) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("G");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("G");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("G");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("G");
            return 4;
        }
    }

    public int questionH() {
        character = MediaPlayer.create(this, R.raw.h);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 8) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;

        if (randA == 1) {
            bt1.setText("H ");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("H");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("H");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("H");
            return 4;
        }
    }

    public int questionI() {
        character = MediaPlayer.create(this, R.raw.i);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        while (num1 == 9) {
            num1 = (int) (Math.random() * (9 - 1)) + 1;
        }
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("I");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("I");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("I");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("I");
            return 4;
        }
    }

    public int questionJ() {
        character = MediaPlayer.create(this, R.raw.j);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        while (num2 == 10) {
            num2 = (int) (Math.random() * (17 - 10)) + 10;
        }
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("J");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("J");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("J");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("J");
            return 4;
        }
    }

    public int questionK() {
        character = MediaPlayer.create(this, R.raw.k);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        while (num2 == 11) {
            num2 = (int) (Math.random() * (17 - 10)) + 10;
        }
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("K");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("K");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("K");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("K");
            return 4;
        }
    }

    public int questionL() {
        character = MediaPlayer.create(this, R.raw.l);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        while (num2 == 12) {
            num2 = (int) (Math.random() * (17 - 10)) + 10;
        }
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("L");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("L");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("L");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("L");
            return 4;
        }
    }

    public int questionM() {
        character = MediaPlayer.create(this, R.raw.m);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        while (num2 == 13) {
            num2 = (int) (Math.random() * (17 - 10)) + 10;
        }
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("M");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("M");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("M");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("M");
            return 4;
        }
    }

    public int questionN() {
        character = MediaPlayer.create(this, R.raw.n);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        while (num2 == 14) {
            num2 = (int) (Math.random() * (17 - 10)) + 10;
        }
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("N");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("N");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("N");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("N");
            return 4;
        }
    }

    public int questionO() {
        character = MediaPlayer.create(this, R.raw.o);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        while (num2 == 15) {
            num2 = (int) (Math.random() * (17 - 10)) + 10;
        }
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("O");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("O");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("O");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("O");
            return 4;
        }
    }

    public int questionP() {
        character = MediaPlayer.create(this, R.raw.p);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        while (num2 == 16) {
            num2 = (int) (Math.random() * (17 - 10)) + 10;
        }
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("P");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("P");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("P");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("P");
            return 4;
        }
    }

    public int questionQ() {
        character = MediaPlayer.create(this, R.raw.q);


        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        while (num2 == 17) {
            num2 = (int) (Math.random() * (17 - 10)) + 10;
        }
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("Q");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("Q");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("Q");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("Q");
            return 4;
        }
    }

    public int questionR() {
        character = MediaPlayer.create(this, R.raw.r);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 18) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("R");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("R");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("R");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("R");
            return 4;
        }
    }

    public int questionS() {
        character = MediaPlayer.create(this, R.raw.s);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 19) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("S");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("S");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("S");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("S");
            return 4;
        }
    }

    public int questionT() {
        character = MediaPlayer.create(this, R.raw.t);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 20) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("T");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("T");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("T");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("T");
            return 4;
        }
    }

    public int questionU() {
        character = MediaPlayer.create(this, R.raw.u);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 21) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }
        randA = (int) (Math.random() * (4 - 1)) + 1;

        if (randA == 1) {
            bt1.setText("U");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("U");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("U");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("U");
            return 4;
        }
    }

    public int questionV() {
        character = MediaPlayer.create(this, R.raw.v);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 22) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }

        if (randA == 1) {
            bt1.setText("V");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("V");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("V");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("V");
            return 4;
        }
    }

    public int questionW() {
        character = MediaPlayer.create(this, R.raw.w);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 23) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }

        if (randA == 1) {
            bt1.setText("W");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("W");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("W");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("W");
            return 4;
        }
    }

    public int questionX() {
        character = MediaPlayer.create(this, R.raw.x);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 24) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }

        if (randA == 1) {
            bt1.setText("X");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("X");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("X");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("X");
            return 4;
        }
    }

    public int questionY() {
        character = MediaPlayer.create(this, R.raw.y);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 25) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }

        if (randA == 1) {
            bt1.setText("Y");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("Y");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("Y");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("Y");
            return 4;
        }
    }

    public int questionZ() {
        character = MediaPlayer.create(this, R.raw.z);

        num1 = (int) (Math.random() * (9 - 1)) + 1;
        num2 = (int) (Math.random() * (17 - 10)) + 10;
        num3 = (int) (Math.random() * (26 - 18)) + 18;
        while (num3 == 26) {
            num3 = (int) (Math.random() * (17 - 10)) + 10;
        }

        if (randA == 1) {
            bt1.setText("Z");
            bt2.setText(randomCharacter(num1));
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 1;
        } else if (randA == 2) {
            bt1.setText(randomCharacter(num1));
            bt2.setText("Z");
            bt3.setText(randomCharacter(num2));
            bt4.setText(randomCharacter(num3));
            return 2;
        } else if (randA == 3) {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText("Z");
            bt4.setText(randomCharacter(num3));
            return 3;
        } else {
            bt1.setText(randomCharacter(num1));
            bt2.setText(randomCharacter(num2));
            bt3.setText(randomCharacter(num3));
            bt4.setText("Z");
            return 4;
        }
    }

    public String randomCharacter(int num) {
        switch (num) {
            case 1: {
                return "A";
            }
            case 2: {
                return "B";
            }
            case 3: {
                return "C";
            }
            case 4: {
                return "D";
            }
            case 5: {
                return "E";
            }
            case 6: {
                return "F";
            }
            case 7: {
                return "G";
            }
            case 8: {
                return "H";
            }
            case 9: {
                return "I";
            }
            case 10: {
                return "J";
            }
            case 11: {
                return "K";
            }
            case 12: {
                return "L";
            }
            case 13: {
                return "M";
            }
            case 14: {
                return "N";
            }
            case 15: {
                return "O";
            }
            case 16: {
                return "P";
            }
            case 17: {
                return "Q";
            }
            case 18: {
                return "R";
            }
            case 19: {
                return "S";
            }
            case 20: {
                return "T";
            }
            case 21: {
                return "U";
            }
            case 22: {
                return "V";
            }
            case 23: {
                return "W";
            }
            case 24: {
                return "X";
            }
            case 25: {
                return "Y";
            }
            case 26: {
                return "Z";
            }
        }
        return "A";
    }

    public void button1(View view) {
        choice = 1;
        answerMade = true;
        test();
    }

    public void button2(View view) {
        choice = 2;
        answerMade = true;
        test();
    }

    public void button3(View view) {
        choice = 3;
        answerMade = true;
        test();
    }

    public void button4(View view) {
        choice = 4;
        answerMade = true;
        test();
    }


    public void playQuestion(View view) {
        question.start();
    }

    public void playChar(View view) {
        character.start();
    }
    public void playCorrect(){correct.start();}
    public void playIncorrect(){incorrect.start();}
    public void test() {
        counter++;

        if (answerMade == true) {
            checkAns();
        }

        if (counter == 27) {
            Intent intent = new Intent(Test_hard.this, Result.class);
            intent.putExtra("result", answerCorrectly);
            startActivityForResult(intent, 1);
        } else if (counter <= 26) {
            questionNum.setText(counter + "");


            switch (randomQ[counter - 1]) {

                case 1: {
                    answer = questionA();
                    answerChar = 'A';
                    break;
                }
                case 2: {
                    answer = questionB();
                    answerChar = 'B';
                    break;
                }

                case 3: {
                    answer = questionC();
                    answerChar = 'C';
                    break;
                }

                case 4: {
                    answer = questionD();
                    answerChar = 'D';
                    break;
                }

                case 5: {
                    answer = questionE();
                    answerChar = 'E';
                    break;
                }

                case 6: {
                    answer = questionF();
                    answerChar = 'F';
                    break;
                }

                case 7: {
                    answer = questionG();
                    answerChar = 'G';
                    break;
                }

                case 8: {
                    answer = questionH();
                    answerChar = 'H';
                    break;
                }

                case 9: {
                    answer = questionI();
                    answerChar = 'I';
                    break;
                }

                case 10: {
                    answer = questionJ();
                    answerChar = 'J';
                    break;
                }

                case 11: {
                    answer = questionK();
                    answerChar = 'K';
                    break;
                }

                case 12: {
                    answer = questionL();
                    answerChar = 'L';
                    break;
                }

                case 13: {
                    answer = questionM();
                    answerChar = 'M';
                    break;
                }

                case 14: {
                    answer = questionN();
                    answerChar = 'N';
                    break;
                }

                case 15: {
                    answer = questionO();
                    answerChar = 'O';
                    break;
                }

                case 16: {
                    answer = questionP();
                    answerChar = 'P';
                    break;
                }

                case 17: {
                    answer = questionQ();
                    answerChar = 'Q';
                    break;
                }

                case 18: {
                    answer = questionR();
                    answerChar = 'R';
                    break;
                }

                case 19: {
                    answer = questionS();
                    answerChar = 'S';
                    break;
                }

                case 20: {
                    answer = questionT();
                    answerChar = 'T';
                    break;
                }

                case 21: {
                    answer = questionU();
                    answerChar = 'U';
                    break;
                }

                case 22: {
                    answer = questionV();
                    answerChar = 'v';
                    break;
                }

                case 23: {
                    answer = questionW();
                    answerChar = 'W';
                    break;
                }

                case 24: {
                    answer = questionX();
                    answerChar = 'X';
                    break;
                }

                case 25: {
                    answer = questionY();
                    answerChar = 'y';
                    break;
                }

                case 26: {
                    answer = questionZ();
                    answerChar = 'Z';
                    break;
                }
            }
        }


    }

    public void checkAns() {
        if (answer == choice) {
            ++answerCorrectly;
            playCorrect();
            final LodingScreen lodingScreen = new LodingScreen(Test_hard.this);
            lodingScreen.startLodingDialog();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    lodingScreen.dissmissDialog();

                }
            }, 1000);
        }

        //Return value error, other ok, verification need double check
        else if (answer != choice) {
            playIncorrect();
            TextView correcrtAnsert;
            myDialog.setContentView(R.layout.activity_wrong_answer);
            correcrtAnsert = (TextView) myDialog.findViewById(R.id.tv_ans);
            correcrtAnsert.setText(answerChar+"");
            myDialog.show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    myDialog.dismiss();
                }
            }, 5000);
        }
    }

    public void back(View view) {
        final Quite lodingScreen = new Quite(Test_hard.this);
        lodingScreen.startLodingDialog();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                lodingScreen.dissmissDialog();

            }
        }, 9000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Test_hard.this,Level.class);
                startActivity(i);
            }
        }, 2000);
    }

}