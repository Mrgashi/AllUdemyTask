package src.com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1100;
        int levelCompleted = 5;
        int bonus = 100;

       /* if(score < 5000 && score > 1000) {
            System.out.println("Your score was less 5000 and more than 1000");
            System.out.println("This was executed outside the if scope");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        }
        else {
            System.out.println("Got here");
        }*/

        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;


        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            int secondFinalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your second Final score was " + secondFinalScore);
        }

    }
}
