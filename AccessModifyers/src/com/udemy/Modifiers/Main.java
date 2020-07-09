package com.udemy.Modifiers;

public class Main {
    public static void main(String[] args) {

        Account mir = new Account("Mirdons Account");

        mir.deposit(4000);
        mir.withdraw(200);
        mir.deposit(-200);
        mir.withdraw(-200);
        mir.calculateBalance();
        System.out.println("Balance is " + mir.getBalance());

     //   // big nono! it is set as public in the Account class. This means i can change it to whatever i want.
     //   mir.balance = 10000;
     //   System.out.println(mir.balance);
     //   mir.transactions.add(10000);
     //   mir.calculateBalance();
     //   System.out.println("New balance is " + mir.getBalance());
//
     //   // after changing them to private we can only change them via deposit and withdraw methods.



    }
}
