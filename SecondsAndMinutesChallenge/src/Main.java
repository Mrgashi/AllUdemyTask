public class Main {

    private static final String INVALID_UNDERSCORE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_UNDERSCORE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minuteString = remainderMinutes + "m";
        if (remainderMinutes < 10) {
            minuteString = "0" + minuteString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minuteString + " " + secondsString + "";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_UNDERSCORE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
