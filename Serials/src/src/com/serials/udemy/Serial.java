package src.com.serials.udemy;

public class Serial {

    public static void fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        System.out.println("Fibonacci Series: ");
        System.out.println(n1 + "\n" +  n2);

        for (int i = 2; i <= n; ++i) {
            int fibo = n1 + n2;
            n1 = n2;
            n2 = fibo;
            System.out.println(fibo);
        }
    }

    public static void factorial(int n) {
        int fact = 1;
        System.out.println("Factorial:");

        for(int i = 1; i <= n; ++i) {
            fact *= i;
            System.out.println(fact);
        }
    }

    public  static void nSum(int n) {
        int sum = 0;
        System.out.println("Sum:");

        for(int i = 0; i <= n; ++i) {
            sum += i;
            System.out.println(sum);
        }

    }
}
