package first_program;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float value ");
        float a = sc.nextFloat();
        System.out.println("Float is: " + a);
        System.out.println("Enter byte value: ");
        byte b = sc.nextByte();
        System.out.println("Byte is: " + b);
        System.out.println("Enter char value: ");
        char c = sc.next().charAt(0);
        System.out.println("Char value is: " + c);
    }
}
