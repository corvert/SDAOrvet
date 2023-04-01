package bookJavaFund.exceptions;

public class Main4 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("this is not a number");
        } catch (NumberFormatException e) {
            System.out.println("Sorry, the string does not contain an integer");
        }
    }
}
