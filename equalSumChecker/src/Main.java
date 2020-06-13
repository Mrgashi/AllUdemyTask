public class Main {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 2, 3));
        System.out.println(hasEqualSum(1, 2, 4));
        System.out.println(hasEqualSum(1, -1, 0));
        System.out.println(hasEqualSum(-1, -1, 0));
    }

    public static boolean hasEqualSum(int val1, int val2, int val3) {
        int sum = val1 + val2;
        int sumEqual = val3;
        return sum == sumEqual;
    }
}
