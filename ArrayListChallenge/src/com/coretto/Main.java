package com.coretto;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone iphone = new MobilePhone("40939202");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter actions: (6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    iphone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void updateContact() {
        System.out.println("Enter name to update");
        String name = scanner.nextLine();
        Contact existingContact = iphone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
        }
        System.out.println("Enter new contact name ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phoneNumber");
        int newPhoneNumber = scanner.nextInt();
        scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if (iphone.updateContact(existingContact, newContact)) {
            System.out.println("Success! ");
        } else {
            System.out.println("Error updating");
        }
    }

    private static void removeContact() {
        System.out.println("Enter name to update");
        String name = scanner.nextLine();
        Contact existingContact = iphone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
        }
        if (iphone.removeContact(existingContact)) {
            System.out.println("Success");
        } else {
            System.out.println("Error!");
        }
    }

    private static void queryContact() {
        System.out.println("Enter name to update");
        String name = scanner.nextLine();
        Contact existingContact = iphone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Name: " + existingContact.getContactName() + ", phoneNumber " + existingContact.getPhoneNr());
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        int phoneNumber = scanner.nextInt();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (iphone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone: " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    public static void startPhone() {
        System.out.println("Starting phone...");
    }

    public static void printActions() {
        System.out.println("\n Available actions: \npress: ");
        System.out.println("0 - to shutdown. \n" +
                "1 - to print Contacts \n" +
                "2 - add a Contact \n" +
                "3 - to update \n" +
                "4 - to remove a exisiting contact \n" +
                "5 - cuerry a exisiting contact \n" +
                "6 - to print a list of available actions");
        System.out.println("choose your actions: ");
    }
}