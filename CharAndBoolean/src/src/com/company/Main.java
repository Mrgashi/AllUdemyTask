package src.com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char unicode = '\u00A9';

        System.out.println(myChar);
        System.out.println(unicode);

        boolean myTrue = true;
        boolean myFalse = false;

        boolean isCustomerOver21 = true;
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
