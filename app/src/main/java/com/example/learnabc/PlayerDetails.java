package com.example.learnabc;

public class PlayerDetails {
    private String playerName;
    private int correctAns;

    PlayerDetails(){
        this("",0);
    }
    PlayerDetails( String playerName,int correctAns){
        this.playerName=playerName;
        this.correctAns=correctAns;
    }


    public int getCorrectAns() {
        return correctAns;
    }

    public String getPlayerName() { return playerName; }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }

    public void setPlayerName(String playerName) { this.playerName = playerName; }
}
