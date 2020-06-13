public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.2222221, 1.223121234));
        System.out.println(areEqualByThreeDecimalPlaces(1.2222221, 1.2222221));
    }

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {

       int x = (int) (value1 * 1000);
       int y = (int) (value2 * 1000);

       if (x == y) {
           return true;
       } else {
           return false;
       }
    }
}
