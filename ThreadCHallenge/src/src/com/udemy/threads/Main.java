package src.com.udemy.threads;



public class Main {

    public static void main(String[] args)  {

        final BankAccount bankAccount = new BankAccount("123456", 1000.00);

        bankAccount.deposit(100.00);
        bankAccount.withdraw(100.00);
        bankAccount.printAccountNumber();

    }
}
