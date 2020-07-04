package com.Udemy.InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player Mirdon = new Player("Zuez", 100, 150);
        System.out.println(Mirdon);

        Mirdon.setHitPoints(250);
        System.out.println(Mirdon);
        Mirdon.setWeapon("Bow");
        saveObject(Mirdon);

        Monster zombie = new Monster("BrainEater", 200, 300);
        System.out.println(zombie);
        loadObject(zombie);
        saveObject(zombie);
    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 0:
                    quit = true;
                    System.out.println("Quitting");
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToLoad) {
        for (int i = 0; i < objectToLoad.write().size(); i++) {
            System.out.println("Saving " + objectToLoad.write().get(i) + " to storage");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}


