public class Main {
    public static void main(String[] args) {
        switchTestChar('b');
        switchWithString("may");
        printDayOfTheWeek(2);
        ifThenInsteadOfSwitch(3);
        printNumberInWord(7);
    }

    public static void switchTestChar(char a) {
        switch (a) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println("It was an " + a + "! ");
                break;
            default:
                System.out.println("Dont know what THIS is!");
                break;
        }
    }

    public static void switchWithString(String month) {
        switch (month.toLowerCase()) {
            case "january":
            case "february":
            case "march":
            case "april":
            case "may":
                System.out.println("Found " + month + " In the case");
                break;
            default:
                System.out.println("No month found");
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void ifThenInsteadOfSwitch(int day) {
        if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else if (day == 6) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }

    private static void printNumberInWord (int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
