package udemy;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Dnb");

        bank.addBranch("Vestfold");

        bank.addCustomer("Vestfold", "Mirdon", 1330.3);
        bank.addCustomer("Vestfold", "Siri", 330390.2);
        bank.addCustomer("Vestfold", "Gashi", 3322.1);

        bank.addBranch("Oslo");
        bank.addCustomer("Oslo", "Bob", 50.30);

        bank.addCustomerTransaction("Vestfold", "Mirdon", 3100.21);
        bank.addCustomerTransaction("Vestfold", "Gashi", 55939.21);
        bank.addCustomerTransaction("Vestfold", "Siri", 388282.21);
        bank.addCustomerTransaction("Vestfold", "Siri", 38382.21);

        bank.listCustomers("Vestfold", true);
        bank.listCustomers("Oslo", true);

        bank.addBranch("LarvikBanken");
        if (!bank.addCustomer("LarvikBanken", "Arion", 53.44)) {
            System.out.println("Error, LarvikBanken finnes ikke");
        }

        if (!bank.addBranch("Vestfold")) {
            System.out.println("Vestfold finnes allerede");
        }

        if (!bank.addCustomerTransaction("Vestfold", "Simon", 3.3)) {
            System.out.println("Customer does not exist");
        }
        if (!bank.addCustomer("Vestfold", "Mirdon", 5.21)) {
            System.out.println("Customer Mirdon finnes allerede");
        }
    }
}
