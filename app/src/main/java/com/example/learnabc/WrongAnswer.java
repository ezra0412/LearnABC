package com.example.learnabc;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;


class LodingScreenWrong {
    private Activity activity;
    private AlertDialog alertDialog;

    LodingScreenWrong(Activity myActivity){
        activity = myActivity;
    }

    void startLodingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater=activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.activity_wrong_answer,null));
        builder.setCancelable(true);

        alertDialog=builder.create();
        alertDialog.show();
    }
    void dissmissDialog(){
        alertDialog.dismiss();
    }
}

