package advFeatLiveCoding.task08;

import java.util.Random;
import java.util.Scanner;

public class PssGeneratorExample {
    //Declare a constant for uppercase letter
    private static final String UPPER_CASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String ALL_CHARS = UPPER_CASE_CHARS + LOWER_CASE_CHARS + DIGITS;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What s the length of password");
        int n = scan.nextInt();
        String password = generatePassword(n);
        System.out.println("pass word is " + password);
    }

    private static String generatePassword(int length){
        Random rand = new Random();

        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = rand.nextInt(ALL_CHARS.length());

            char randomChar = ALL_CHARS.charAt(randomIndex);

            password.append(randomChar);
        }
        return password.toString();
    }


}
