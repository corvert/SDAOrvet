package first_program;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        twoNumbers();
    }

    public static void twoNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a2 = scanner.nextInt();
        System.out.println("Enter second number: ");
        boolean isInt = scanner.hasNextInt();
        if (isInt) {

            int b2 = scanner.nextInt();

            if (a2 == b2) {
                System.out.println("Numbers are EQUAL");
            } else if (a2 != b2 && a2 < b2) {
                System.out.println("Numbers are NOT EQUAL and first number is SMALLER than second");
            } else {
                System.out.println("Numbers are NOT EQUAL and first number is BIGGER than second");
            }
        } else {
            System.out.println("This is not number");
        }
    }
}




