public class Main {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

        printEqual(2, 1, 1);

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 25));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = minutes % 525600;
            days = days / 1440;

            System.out.println(minutes + " min = " + years + " y " + "and " + days + " d");
        }
    }

    public static void printEqual(int x, int y, int z) {
        if ((x < 0) || (y < 0) || (z < 0)) {
            System.out.println("Invalid Value");
        } else if ((x == y) && (y == z)) {
            System.out.println("All numbers are equal");
        } else if (!(x == y) && !(y == z) && !(x == z)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer && temperature <= 45 && temperature >= 25) {
            return true;
        } else return !summer && temperature <= 35 && temperature >= 25;
    }
}
