package com.example.learnabc;

import java.util.HashMap;
import java.util.Map;

public class PlayerDetails {
    private String playerName;
    private int scoreEasy;
    private int scoreMedium;
    private int scoreHard;

    PlayerDetails(){
        this("",0,0,0);
    }
    PlayerDetails( String playerName , int scoreEasy, int scoreHard, int scoreMedium){
        this.playerName=playerName;
        this.scoreEasy=scoreEasy;
        this.scoreMedium=scoreMedium;
        this.scoreHard=scoreHard;
    }




    public String getPlayerName() { return playerName; }

    public int getScoreEasy() { return scoreEasy; }

    public int getScoreHard() {return scoreHard; }

    public int getScoreMedium() { return scoreMedium; }

    public void setPlayerName(String playerName) { this.playerName = playerName; }

    public void setScoreEasy(int scoreEasy) { this.scoreEasy = scoreEasy; }

    public void setScoreHard(int scoreHard) { this.scoreHard = scoreHard; }

    public void setScoreMedium(int scoreMedium) { this.scoreMedium = scoreMedium; }
}
