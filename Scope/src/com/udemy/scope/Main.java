package com.udemy.scope;

import java.util.Scanner;

/* NOT A WAY TO CODE! This is just to work on scope and understanding how scope works*/
public class Main {
    // Global scope, this is reachable wherever.
    public static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {

        // making a new class X calling it x and passing the method x in it.
        X x = new X(x());
        x.x();

        Y y = new Y(y());
        y.y();

    }

    public static int x() {
        System.out.println("Enter a number: ");
        // to get hold of the scanner we need to go through main.
        int x = Main.x.nextInt();
        Main.x.nextLine();
        return x;
    }

    public static int y() {
        System.out.println("Enter a number: ");
        int y =  x.nextInt();
        x.nextLine();
        return y;
    }
}
