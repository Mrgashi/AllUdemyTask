package src.com.udemy.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //int x = 90;
        // int y = 0;
        // System.out.println(divideLBYL(x, y)); // gives 0
        // System.out.println(divideEAFP(x, y)); // gives 0
        // System.out.println(divide(x, y)); /* #THIS CRASHES# Exception in thread "main" java.lang.ArithmeticException: / by zero
        //                                                        at src.com.udemy.Exceptions.Main.divide(Main.java:39)
        //                                                       at src.com.udemy.Exceptions.Main.main(Main.java:11)*/

        //int x = getInt(); // calling the method getInt() and saving it in variable x
        //System.out.println("x is " + x); // This also makes it crash, because we asking for an int in the method.
        //int l = getIntLBYL(); // calling the method getIntLBYL() and saving it in int variable called l.
        //System.out.println("L is " + l); // this does not print other than 0 if there are chars other than numbers inputed.
        int k = getIntEAFP(); // calling getIntEAFP() and saving it in k.
        System.out.println("k is " + k); // this runs exactly the same as the code above, difference is this method is much more cleaner and elegant.
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in); // asking for a int from system input.
        return s.nextInt(); // retuning and saving the typed int in variable called s.
    }

    private static int getIntLBYL() { // a lot of code to handle this.
        Scanner s = new Scanner(System.in); // Making a object of the Scanner and naming it s.
        boolean isValid = true; // boolean value of true is declared and stored in isValid.
        System.out.println("Please enter an integer"); // printing to the system.
        String input = s.next(); // saving input from keyboard in variable called input.
        for (int i = 0; i < input.length(); i++) { // starting a forloop for the length of the input.
            if (!Character.isDigit(input.charAt(i))) { // checking to se if each input from keyboard is a char. if not then next steps is to tell is valid to turn to false!
                isValid = false;  // here we actually make the isValid not valid by saving the value false in the isValid variable.
                break; // we break out of this loop.
            }
        }
        if (isValid) { //  if isValid is still true to this point we return the string parsed to ints
            return Integer.parseInt(input);
        }
        return 0; // return 0 if above fails.
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a integer");
        try {
            return s.nextInt(); // if there is not a error, this code runs
        } catch (InputMismatchException e) {
            return 0; // if there is an error, this runs.
        }
    }

    private static int divideLBYL(int x, int y) {
        // creates error if divide by 0
        // we are checking if input(just one of them) if its 0.
        // if its 0 we return 0.
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        /*
        here we are doing a try catch block to check. We call this a "Easier to ask for forgiveness than permission",
        type of mindset. Where you just do the thing you want then afterwards ask for forgiveness.
        This made it easier for me to understand: try and lets see, means that the code is run and a exception is shown
         */
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
