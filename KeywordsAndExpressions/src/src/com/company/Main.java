package src.com.company;

public class Main {

    public static void main(String[] args) {

        // a mile is equal to 1609344 kilomters.
        // from the name kilometer and out is an expression.
        double kilometer = (100 * 1.609344);
        // by adding the datatype it now is a valid java expression.

        int highScore = 50;
        if(highScore == 50) { // inside of the sout is also an expression,
                            //  inside the method within the perentansese is the expression.
            System.out.println("This is an expression");
        }

        int score = 100; // here score = 100 is the expression.
        if (score > 99) { // here the score > 99 is the expression
            System.out.println("You got the high score!"); // here the String inside the sout is the expression
            score = 0; // here the score = 0 is the expression.
        }
        
    }
}
