package codeWars;

public class validatePin1 {
    public static void main(String[] args) {
        System.out.println(validatePin("111."));
    }

    public static boolean validatePin(String pin) {
        if (!pin.matches("^[0-9]+$")){
            return false;
        }
        else if (pin.length() == 4 || pin.length() == 6) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validatePin2(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
