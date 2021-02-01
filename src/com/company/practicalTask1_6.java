package com.company;

public class practicalTask1_6 {

    public static void main(String[] args) {
        displayHighScorePosition("Santa", calculateHighScorePosition(1500));
        displayHighScorePosition("Ivo", calculateHighScorePosition(900));
        displayHighScorePosition("Linda", calculateHighScorePosition(400));
        displayHighScorePosition("Vigo", calculateHighScorePosition(50));
    }

    public static int calculateHighScorePosition(int score) {
        if(score>1000) {
            return 1;
        } else if (score<1000 && score>500) {
            return 2;
        } else if (score<500 && score>100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " +
                position + " on the high score table.");

    }
}
