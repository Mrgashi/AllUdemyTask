public class Main {

    public static void main(String[] args){

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int newNumber = number;

        if (number == 0) {
            return false;
        }

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return newNumber == reverse;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;
        int sum = 0;

        while (number > 0) {
            firstDigit = number % 10;
            number = number / 10;
        }
        sum = firstDigit + lastDigit;
        return sum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        return number1 % 10 == number2 % 10 ||
                number1 % 10 == number2 / 10 ||
                number2 % 10 == number1 / 10 ||
                number1 / 10 == number2 / 10;

    }

    public static boolean lastDigitChecker(int n1, int n2, int n3) {
        int n1L = n1 % 10;
        int n2L = n2 % 10;
        int n3L = n3 % 10;

        if ((isValid(n1) == false) || (isValid(n2) == false) || (isValid(n3) == false)) {
            return false;
        } else return ((n1L == n2L) || (n1L == n3L) || (n2L == n3L));
    }

    public static boolean isValid(int number) {
        return number < 10 || number > 1000;
    }

    public static int getGreatestCommonDivisor(int value1, int value2) {
        int divisor = 0;
        if (value1 < 10 || value2 < 10) {
            return -1;
        }
        if (value1 > 9 || value2 > 9) {
            for (int i = 1; i <= value1; i++) {
                if ((value1 % i == 0) && (value2 % i == 0)) {
                    divisor = i;
                }
            }
        }
        return divisor;
    }
}
