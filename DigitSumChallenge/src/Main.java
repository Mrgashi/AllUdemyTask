public class Main {
    public static void main(String[] args) {
    System.out.println(sumDigits(125));
    System.out.println(sumDigits(-1));
    System.out.println(sumDigits(125));
    }

    private static int sumDigits(int number) {
        if ((number < 10)) {
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 12 = 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            //extract the least signifigant digit.
            int digit = number % 10;
            sum += digit;
            // drop the least signifigant digit
            number /= 10; // number = number / 10;
        }
 return sum;
    }
}