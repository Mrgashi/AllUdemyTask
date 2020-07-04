package com.Udemy.InnerClass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    private static Button secondBtnPrint = new Button("Second Print");

    public static void main(String[] args) {

           Gearbox mcLaren = new Gearbox(6);
           mcLaren.operateClutch(true);
           mcLaren.changeGear(1);
           mcLaren.operateClutch(false);
           System.out.println(mcLaren.wheelSpeed(1000));
           mcLaren.changeGear(2);
           System.out.println(mcLaren.wheelSpeed(3000));
           mcLaren.operateClutch(true);
           mcLaren.changeGear(3);
           mcLaren.operateClutch(false);
           System.out.println(mcLaren.wheelSpeed(6000));


        class ClickListener implements Button.OnClickListener {
            public ClickListener(String title) {
                System.out.println(title + "I´ve been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " clicked");
            }
        }

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
                case 2:
                    secondBtnPrint.onClick();
                    break;

            }
        }
    }
}

// four types of nested classes.
// Static nested, non static nested class(Inner class), locla class(class inside a scope block usually called a method)
// anon class, nested class without a class name.
// Nested Class, can not access identical classes.



