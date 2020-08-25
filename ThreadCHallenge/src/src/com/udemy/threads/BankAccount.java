package src.com.udemy.threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccountMain {

    private double balance;
    private String accountNumber;
    private ReentrantLock re = new ReentrantLock();

    public BankAccountMain(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public boolean deposit(double amount) {
        boolean status = false;
        try {
            if (re.tryLock(1L, TimeUnit.SECONDS)){
                try{
                    balance += amount;
                    status = true;
                } finally {
                    re.unlock();
                }
            } else {
                System.out.println("Could not get lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Transaction status = " + status);

        return status;
    }

    public void withdraw(double amount)  {

        boolean status = false;

        try {
            if (re.tryLock(1L, TimeUnit.SECONDS)){
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    re.unlock();
                }
            } else {
                System.out.println("Could not get lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number = " + accountNumber);
    }
}
