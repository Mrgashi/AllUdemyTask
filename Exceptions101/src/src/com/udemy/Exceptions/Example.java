package src.com.udemy.Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide(); // this can throw one Exception, ArithmeticException. But also a InputMismatchException.
            System.out.println(result); // Callstack, prints al the calls done under the point where the code failed.
            // With the CallStack we can see what has been called and where the code failed.
            // the best way to debugg a Exception is to start at the bottom of the message.
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to performe a division, autopilot shutting down.");
        }
    }

    private static int divide() {
        int x, y;
        try {
            x = getInt(); // this does not crash the code since its in the try block
            y = getInt();
            System.out.println("x is " + x + " y is " + y);
            return x/y;
        } catch (NoSuchElementException e) {
            //x = getInt(); // this makes the code crash. should not do this.
            throw new ArithmeticException("No suitable input");
        } catch (ArithmeticException e) {
            // nested exceptions.
            throw new ArithmeticException("Attempt to divide by zero!"); // gives a cleaner stacktrace.
        }
    }

    private static int getInt() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a integer.");
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                // go round again. Read past the end of line in the input first.
                s.nextLine();
                System.out.println("Please enter a number only using the digits [0-9]");
            }
        }
    }

}
