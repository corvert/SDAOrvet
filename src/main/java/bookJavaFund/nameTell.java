package bookJavaFund;

import java.util.Scanner;

public class nameTell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name");
        String name = scanner.nextLine();
        System.out.println("Your name has " + name.length() + " letters");
        char c = name.charAt(0);
        System.out.println("First letter is " + c);

    }
}
