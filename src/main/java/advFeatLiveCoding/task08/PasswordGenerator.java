package advFeatLiveCoding.task08;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static final Random random = new Random();
    private static final String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How long should password be?");
        int n = sc.nextInt();
        int passLength = random.nextInt(n);
        String password = generatePass(passLength);
        System.out.println("Password is: " + password);
    }
    public static String generatePass(int length){
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            password.append(digits.charAt(random.nextInt(digits.length())));
        }
        return new String(password);
    }
}
