package codeWars;

public class HumanReadableTime {
    /*
    Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)
     */
    public static void main(String[] args) {
        System.out.println(makeReadable(5));
    }

    public static String makeReadable(int seconds) {
        if (seconds == 0){
            return "00:00:00";
        } else {
            int h = seconds / 3600;
            int min = seconds % 3600 / 60;
            int sec = seconds % 3600 % 60;
            String hoursString = convertString(h);
            String minString = convertString(min);
            String secString = convertString(sec);

            return hoursString + ":" + minString + ":" + secString;
        }
    }

    public static String convertString(int number) {
        String numberString = String.valueOf(number);
        if (number < 10) {
            numberString = "0" + numberString;
        }
        return numberString;
    }
    public static String makeReadable1(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
}
