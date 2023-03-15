package lecture01;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = sc.nextInt();
        System.out.println("Enter second num: ");
        int b = sc.nextInt();
        System.out.println("Enter third num ");
        int c = sc.nextInt();

        double delta = (b * b) - (4 * a * c);
        double xOne = (-b - Math.sqrt(delta)) / 2 * a;
        double xTwo = (-b + Math.sqrt(delta)) / 2 * a;

        if (delta >= 0) {
            System.out.println("x1 is " + xOne);
            System.out.println("x2 is " + xTwo);
        } else {
            System.out.println("Delta negative");
        }
    }
}
