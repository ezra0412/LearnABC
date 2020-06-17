package com.example.learnabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Learn extends AppCompatActivity {
    TextView questionNumTracker,letter,itemName;
    ImageView item;
    MediaPlayer itemFor,letterSound,itemSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        questionNumTracker=findViewById(R.id.tv_questionNUM_test);
        letter=findViewById(R.id.tv_letter_learn);
        itemName=findViewById(R.id.tv_itemName_learn);
        item=findViewById(R.id.img_item_learn);
        itemFor=MediaPlayer.create(this,R.raw.for_apple);
        letterSound=MediaPlayer.create(this,R.raw.a);
        itemSound=MediaPlayer.create(this,R.raw.apple);

        String itemNameChanged=itemName.getText().toString();
        SpannableString ss = new SpannableString(itemNameChanged);
        UnderlineSpan underline = new UnderlineSpan();
        ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        itemName.setText(ss);

    }

    public void back(View view){
        int questionNum = Integer.parseInt(questionNumTracker.getText().toString());
        questionNum--;
        if (questionNum==0){
            questionNum=26;
        }

        switch (questionNum){
            case 1:{
                questionNumTracker.setText("1");
                letter.setText("A");
                item.setImageResource(R.drawable.apple);
                String itemNameChanged="Apple";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_apple);
                letterSound=MediaPlayer.create(this,R.raw.a);
                itemSound=MediaPlayer.create(this,R.raw.apple);
                break;
            }
            case 2:{
                questionNumTracker.setText("2");
                letter.setText("B");
                item.setImageResource(R.drawable.ball);
                String itemNameChanged="Ball";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_ball);
                letterSound=MediaPlayer.create(this,R.raw.b);
                itemSound=MediaPlayer.create(this,R.raw.ball);
                break;
            }

            case 3:{
                questionNumTracker.setText("3");
                letter.setText("C");
                item.setImageResource(R.drawable.chair);
                itemName.setText("Chair");
                String itemNameChanged="Chair";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_chair);
                letterSound=MediaPlayer.create(this,R.raw.c);
                itemSound=MediaPlayer.create(this,R.raw.chair);

                break;
            }

            case 4:{
                questionNumTracker.setText("4");
                letter.setText("D");
                item.setImageResource(R.drawable.door);
                String itemNameChanged="Door";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_door);
                letterSound=MediaPlayer.create(this,R.raw.d);
                itemSound=MediaPlayer.create(this,R.raw.door);
                break;
            }

            case 5:{
                questionNumTracker.setText("5");
                letter.setText("E");
                item.setImageResource(R.drawable.egg);
                String itemNameChanged="Egg";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_egg);
                letterSound=MediaPlayer.create(this,R.raw.e);
                itemSound=MediaPlayer.create(this,R.raw.egg);
                break;
            }

            case 6:{
                questionNumTracker.setText("6");
                letter.setText("F");
                item.setImageResource(R.drawable.fish);
                String itemNameChanged="Fish";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_fish);
                letterSound=MediaPlayer.create(this,R.raw.f);
                itemSound=MediaPlayer.create(this,R.raw.fish);
                break;
            }

            case 7:{
                questionNumTracker.setText("7");
                letter.setText("G");
                item.setImageResource(R.drawable.girl);
                String itemNameChanged="Girl";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_girl);
                letterSound=MediaPlayer.create(this,R.raw.g);
                itemSound=MediaPlayer.create(this,R.raw.girl);
                break;
            }

            case 8:{
                questionNumTracker.setText("8");
                letter.setText("H");
                item.setImageResource(R.drawable.hat);
                String itemNameChanged="Hat";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_hat);
                letterSound=MediaPlayer.create(this,R.raw.h);
                itemSound=MediaPlayer.create(this,R.raw.hat);
                break;
            }

            case 9:{
                questionNumTracker.setText("9");
                letter.setText("I");
                item.setImageResource(R.drawable.ink);
                String itemNameChanged="Ink";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_ink);
                letterSound=MediaPlayer.create(this,R.raw.i);
                itemSound=MediaPlayer.create(this,R.raw.ink);
                break;
            }

            case 10:{
                questionNumTracker.setText("10");
                letter.setText("J");
                item.setImageResource(R.drawable.jug);
                String itemNameChanged="Jug";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_jug);
                letterSound=MediaPlayer.create(this,R.raw.j);
                itemSound=MediaPlayer.create(this,R.raw.jug);
                break;
            }

            case 11:{
                questionNumTracker.setText("11");
                letter.setText("K");
                item.setImageResource(R.drawable.kite);
                String itemNameChanged="Kite";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_kite);
                letterSound=MediaPlayer.create(this,R.raw.k);
                itemSound=MediaPlayer.create(this,R.raw.kite);
                break;
            }

            case 12:{
                questionNumTracker.setText("12");
                letter.setText("L");
                item.setImageResource(R.drawable.leaf);
                String itemNameChanged="Leaf";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_leaf);
                letterSound=MediaPlayer.create(this,R.raw.l);
                itemSound=MediaPlayer.create(this,R.raw.leaf);
                break;
            }

            case 13:{
                questionNumTracker.setText("13");
                letter.setText("M");
                item.setImageResource(R.drawable.moon);
                String itemNameChanged="Moon";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_moon);
                letterSound=MediaPlayer.create(this,R.raw.m);
                itemSound=MediaPlayer.create(this,R.raw.moon);
                break;
            }

            case 14:{
                questionNumTracker.setText("14");
                letter.setText("N");
                item.setImageResource(R.drawable.net);
                String itemNameChanged="Net";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_net);
                letterSound=MediaPlayer.create(this,R.raw.n);
                itemSound=MediaPlayer.create(this,R.raw.net);
                break;
            }

            case 15:{
                questionNumTracker.setText("15");
                letter.setText("O");
                item.setImageResource(R.drawable.orange);
                String itemNameChanged="Orange";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_orange);
                letterSound=MediaPlayer.create(this,R.raw.o);
                itemSound=MediaPlayer.create(this,R.raw.orange);
                break;
            }

            case 16:{
                questionNumTracker.setText("16");
                letter.setText("P");
                item.setImageResource(R.drawable.pencil);
                String itemNameChanged="Pencil";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_pencil);
                letterSound=MediaPlayer.create(this,R.raw.p);
                itemSound=MediaPlayer.create(this,R.raw.pencil);
                break;
            }

            case 17:{
                questionNumTracker.setText("17");
                letter.setText("Q");
                item.setImageResource(R.drawable.queen);
                String itemNameChanged="Queen";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_queen);
                letterSound=MediaPlayer.create(this,R.raw.q);
                itemSound=MediaPlayer.create(this,R.raw.queen);
                break;
            }

            case 18:{
                questionNumTracker.setText("18");
                letter.setText("R");
                item.setImageResource(R.drawable.rat);
                String itemNameChanged="Rat";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_rat);
                letterSound=MediaPlayer.create(this,R.raw.r);
                itemSound=MediaPlayer.create(this,R.raw.rat);
                break;
            }

            case 19:{
                questionNumTracker.setText("19");
                letter.setText("S");
                String itemNameChanged="Star";
                item.setImageResource(R.drawable.star);
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_star);
                letterSound=MediaPlayer.create(this,R.raw.s);
                itemSound=MediaPlayer.create(this,R.raw.star);
                break;
            }

            case 20:{
                questionNumTracker.setText("20");
                letter.setText("T");
                item.setImageResource(R.drawable.tap);
                String itemNameChanged="Tap";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_tap);
                letterSound=MediaPlayer.create(this,R.raw.t);
                itemSound=MediaPlayer.create(this,R.raw.tap);
                break;
            }

            case 21:{
                questionNumTracker.setText("21");
                letter.setText("U");
                item.setImageResource(R.drawable.umbrella);
                String itemNameChanged="Umbrella";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_umbrella);
                letterSound=MediaPlayer.create(this,R.raw.u);
                itemSound=MediaPlayer.create(this,R.raw.umbrella);
                break;
            }

            case 22:{
                questionNumTracker.setText("22");
                letter.setText("V");
                item.setImageResource(R.drawable.vase);
                String itemNameChanged="Vase";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_vase);
                letterSound=MediaPlayer.create(this,R.raw.v);
                itemSound=MediaPlayer.create(this,R.raw.vase);
                break;
            }

            case 23:{
                questionNumTracker.setText("23");
                letter.setText("W");
                item.setImageResource(R.drawable.watch);
                String itemNameChanged="Watch";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_watch);
                letterSound=MediaPlayer.create(this,R.raw.w);
                itemSound=MediaPlayer.create(this,R.raw.watch);
                break;
            }

            case 24:{
                questionNumTracker.setText("24");
                letter.setText("X");
                item.setImageResource(R.drawable.xray);
                String itemNameChanged="X-ray";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_x_ray);
                letterSound=MediaPlayer.create(this,R.raw.x);
                itemSound=MediaPlayer.create(this,R.raw.x_ray);
                break;
            }

            case 25:{
                questionNumTracker.setText("25");
                letter.setText("Y");
                item.setImageResource(R.drawable.yoyo);
                String itemNameChanged="Yoyo";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_yoyo);
                letterSound=MediaPlayer.create(this,R.raw.y);
                itemSound=MediaPlayer.create(this,R.raw.yoyo);
                break;
            }

            case 26:{
                questionNumTracker.setText("26");
                letter.setText("Z");
                item.setImageResource(R.drawable.zip);
                String itemNameChanged="Zip";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_zip);
                letterSound=MediaPlayer.create(this,R.raw.z);
                itemSound=MediaPlayer.create(this,R.raw.zip);
                break;
            }



        }
    }

    public void next(View view){
        int questionNum = Integer.parseInt(questionNumTracker.getText().toString());
        questionNum++;
        if (questionNum==27){
            questionNum=1;
        }
        switch (questionNum){
            case 1:{
                questionNumTracker.setText("1");
                letter.setText("A");
                item.setImageResource(R.drawable.apple);
                String itemNameChanged="Apple";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_apple);
                letterSound=MediaPlayer.create(this,R.raw.a);
                itemSound=MediaPlayer.create(this,R.raw.apple);
                break;
            }
            case 2:{
                questionNumTracker.setText("2");
                letter.setText("B");
                item.setImageResource(R.drawable.ball);
                String itemNameChanged="Ball";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_ball);
                letterSound=MediaPlayer.create(this,R.raw.b);
                itemSound=MediaPlayer.create(this,R.raw.ball);
                break;
            }

            case 3:{
                questionNumTracker.setText("3");
                letter.setText("C");
                item.setImageResource(R.drawable.chair);
                itemName.setText("Chair");
                String itemNameChanged="Chair";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_chair);
                letterSound=MediaPlayer.create(this,R.raw.c);
                itemSound=MediaPlayer.create(this,R.raw.chair);

                break;
            }

            case 4:{
                questionNumTracker.setText("4");
                letter.setText("D");
                item.setImageResource(R.drawable.door);
                String itemNameChanged="Door";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_door);
                letterSound=MediaPlayer.create(this,R.raw.d);
                itemSound=MediaPlayer.create(this,R.raw.door);
                break;
            }

            case 5:{
                questionNumTracker.setText("5");
                letter.setText("E");
                item.setImageResource(R.drawable.egg);
                String itemNameChanged="Egg";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_egg);
                letterSound=MediaPlayer.create(this,R.raw.e);
                itemSound=MediaPlayer.create(this,R.raw.egg);
                break;
            }

            case 6:{
                questionNumTracker.setText("6");
                letter.setText("F");
                item.setImageResource(R.drawable.fish);
                String itemNameChanged="Fish";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_fish);
                letterSound=MediaPlayer.create(this,R.raw.f);
                itemSound=MediaPlayer.create(this,R.raw.fish);
                break;
            }

            case 7:{
                questionNumTracker.setText("7");
                letter.setText("G");
                item.setImageResource(R.drawable.girl);
                String itemNameChanged="Girl";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_girl);
                letterSound=MediaPlayer.create(this,R.raw.g);
                itemSound=MediaPlayer.create(this,R.raw.girl);
                break;
            }

            case 8:{
                questionNumTracker.setText("8");
                letter.setText("H");
                item.setImageResource(R.drawable.hat);
                String itemNameChanged="Hat";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_hat);
                letterSound=MediaPlayer.create(this,R.raw.h);
                itemSound=MediaPlayer.create(this,R.raw.hat);
                break;
            }

            case 9:{
                questionNumTracker.setText("9");
                letter.setText("I");
                item.setImageResource(R.drawable.ink);
                String itemNameChanged="Ink";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_ink);
                letterSound=MediaPlayer.create(this,R.raw.i);
                itemSound=MediaPlayer.create(this,R.raw.ink);
                break;
            }

            case 10:{
                questionNumTracker.setText("10");
                letter.setText("J");
                item.setImageResource(R.drawable.jug);
                String itemNameChanged="Jug";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_jug);
                letterSound=MediaPlayer.create(this,R.raw.j);
                itemSound=MediaPlayer.create(this,R.raw.jug);
                break;
            }

            case 11:{
                questionNumTracker.setText("11");
                letter.setText("K");
                item.setImageResource(R.drawable.kite);
                String itemNameChanged="Kite";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_kite);
                letterSound=MediaPlayer.create(this,R.raw.k);
                itemSound=MediaPlayer.create(this,R.raw.kite);
                break;
            }

            case 12:{
                questionNumTracker.setText("12");
                letter.setText("L");
                item.setImageResource(R.drawable.leaf);
                String itemNameChanged="Leaf";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_leaf);
                letterSound=MediaPlayer.create(this,R.raw.l);
                itemSound=MediaPlayer.create(this,R.raw.leaf);
                break;
            }

            case 13:{
                questionNumTracker.setText("13");
                letter.setText("M");
                item.setImageResource(R.drawable.moon);
                String itemNameChanged="Moon";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_moon);
                letterSound=MediaPlayer.create(this,R.raw.m);
                itemSound=MediaPlayer.create(this,R.raw.moon);
                break;
            }

            case 14:{
                questionNumTracker.setText("14");
                letter.setText("N");
                item.setImageResource(R.drawable.net);
                String itemNameChanged="Net";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_net);
                letterSound=MediaPlayer.create(this,R.raw.n);
                itemSound=MediaPlayer.create(this,R.raw.net);
                break;
            }

            case 15:{
                questionNumTracker.setText("15");
                letter.setText("O");
                item.setImageResource(R.drawable.orange);
                String itemNameChanged="Orange";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_orange);
                letterSound=MediaPlayer.create(this,R.raw.o);
                itemSound=MediaPlayer.create(this,R.raw.orange);
                break;
            }

            case 16:{
                questionNumTracker.setText("16");
                letter.setText("P");
                item.setImageResource(R.drawable.pencil);
                String itemNameChanged="Pencil";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_pencil);
                letterSound=MediaPlayer.create(this,R.raw.p);
                itemSound=MediaPlayer.create(this,R.raw.pencil);
                break;
            }

            case 17:{
                questionNumTracker.setText("17");
                letter.setText("Q");
                item.setImageResource(R.drawable.queen);
                String itemNameChanged="Queen";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_queen);
                letterSound=MediaPlayer.create(this,R.raw.q);
                itemSound=MediaPlayer.create(this,R.raw.queen);
                break;
            }

            case 18:{
                questionNumTracker.setText("18");
                letter.setText("R");
                item.setImageResource(R.drawable.rat);
                String itemNameChanged="Rat";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_rat);
                letterSound=MediaPlayer.create(this,R.raw.r);
                itemSound=MediaPlayer.create(this,R.raw.rat);
                break;
            }

            case 19:{
                questionNumTracker.setText("19");
                letter.setText("S");
                String itemNameChanged="Star";
                item.setImageResource(R.drawable.star);
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_star);
                letterSound=MediaPlayer.create(this,R.raw.s);
                itemSound=MediaPlayer.create(this,R.raw.star);
                break;
            }

            case 20:{
                questionNumTracker.setText("20");
                letter.setText("T");
                item.setImageResource(R.drawable.tap);
                String itemNameChanged="Tap";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_tap);
                letterSound=MediaPlayer.create(this,R.raw.t);
                itemSound=MediaPlayer.create(this,R.raw.tap);
                break;
            }

            case 21:{
                questionNumTracker.setText("21");
                letter.setText("U");
                item.setImageResource(R.drawable.umbrella);
                String itemNameChanged="Umbrella";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_umbrella);
                letterSound=MediaPlayer.create(this,R.raw.u);
                itemSound=MediaPlayer.create(this,R.raw.umbrella);
                break;
            }

            case 22:{
                questionNumTracker.setText("22");
                letter.setText("V");
                item.setImageResource(R.drawable.vase);
                String itemNameChanged="Vase";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_vase);
                letterSound=MediaPlayer.create(this,R.raw.v);
                itemSound=MediaPlayer.create(this,R.raw.vase);
                break;
            }

            case 23:{
                questionNumTracker.setText("23");
                letter.setText("W");
                item.setImageResource(R.drawable.watch);
                String itemNameChanged="Watch";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_watch);
                letterSound=MediaPlayer.create(this,R.raw.w);
                itemSound=MediaPlayer.create(this,R.raw.watch);
                break;
            }

            case 24:{
                questionNumTracker.setText("24");
                letter.setText("X");
                item.setImageResource(R.drawable.xray);
                String itemNameChanged="X-ray";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_x_ray);
                letterSound=MediaPlayer.create(this,R.raw.x);
                itemSound=MediaPlayer.create(this,R.raw.x_ray);
                break;
            }

            case 25:{
                questionNumTracker.setText("25");
                letter.setText("Y");
                item.setImageResource(R.drawable.yoyo);
                String itemNameChanged="Yoyo";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_yoyo);
                letterSound=MediaPlayer.create(this,R.raw.y);
                itemSound=MediaPlayer.create(this,R.raw.yoyo);
                break;
            }

            case 26:{
                questionNumTracker.setText("26");
                letter.setText("Z");
                item.setImageResource(R.drawable.zip);
                String itemNameChanged="Zip";
                SpannableString ss = new SpannableString(itemNameChanged);
                UnderlineSpan underline = new UnderlineSpan();
                ss.setSpan(underline,0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                itemName.setText(ss);
                itemFor=MediaPlayer.create(this,R.raw.for_zip);
                letterSound=MediaPlayer.create(this,R.raw.z);
                itemSound=MediaPlayer.create(this,R.raw.zip);
                break;
            }



        }
    }

    public void playItemFor(View view){
        itemFor.start();
    }

    public void playLetter(View view){
        letterSound.start();
    }

    public void playItem(View view){
        itemSound.start();
    }

    public void home(View view){
        super.onBackPressed();

    }
}
