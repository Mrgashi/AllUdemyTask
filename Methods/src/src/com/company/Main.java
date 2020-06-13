package src.com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000,8,200);
        int highScore = calculateScore(true, 500, 3, 40 );
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("mirMir", 50);
        displayHighScorePosition("sirsir", 400);
        displayHighScorePosition("LokLok", 900);
        displayHighScorePosition("WinnerWinner", 1500);
        displayHighScorePosition("tester", 1000);
        displayHighScorePosition("tester2", 500);
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int playerScore) {
        System.out.println(name + " got position " + calculateHighScorePosition(playerScore) + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {

        int pos = 4;
        if (playerScore >= 1000) {
            pos = 1;
        } else if (playerScore >= 500) {
            pos = 2;
        } else if (playerScore >= 100) {
            pos = 3;
        }
        return pos;
    }

}
