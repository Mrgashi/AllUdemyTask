public class Main {

    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

            if (hourOfDay < 1 || hourOfDay > 23) {
                System.out.println(barking);
                return false;
            } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                System.out.println(barking);
                return true;
            } else {
                System.out.println(barking);
                return false;
            }
    }

}

