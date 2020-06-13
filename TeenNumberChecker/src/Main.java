public class Main {
    public static void main(String[] args) {
        System.out.println(isTeen(20));
        System.out.println(isTeen(12));
        System.out.println(isTeen(13));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int val1, int val2, int val3) {

        if((val1 >= 13 && val1 < 19) || val2 >= 13 && val2 <= 19 || val3 >= 13 && val3 <= 19) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isTeen(int val) {
        return val >= 13 && val <= 19;
    }

}
