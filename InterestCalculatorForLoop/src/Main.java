public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("###########");

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;
        for (int i = 3949; i < 10000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
            }
            if (count == 10) {
                break;
            }
        }
    }

    private static void evenCheck(int number) {
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void print3and5() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);

    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {

        if (start < 0 || end < 0 || start > end) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 != 1;
    }

}
