package lecture05;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one letter");
        char a = sc.next().charAt(0);
        System.out.println("Enter second letter");
        char b = sc.next().charAt(0);

        if (a == b) {
            System.out.println("It is same letter");
        } else {
            int aInAscii = a;
            int bInAscii = b;
            System.out.println(Math.abs(a - b) - 1);
        }
    }
}
