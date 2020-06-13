public class Main {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 1992));


    }
    public static boolean isLeapYear(int year) {
        return year >= 1 && year <= 9999 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static int getDaysInMonth (int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }

        int daysInMonth;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = (isLeapYear(year)) ? 29 : 28;
                break;
            default:
                daysInMonth = -1;
                break;
        }
        return daysInMonth;
    }

}
