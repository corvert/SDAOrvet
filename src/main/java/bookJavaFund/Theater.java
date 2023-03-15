package bookJavaFund;

import java.util.Scanner;

public class Theater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 10, request = 0, remaining = 10;

        while (remaining >= 0) {
            System.out.println("Enter the number of tickets");
            request = sc.nextInt();
            if (request <= remaining) {
                System.out.println("Your " + request + " tickets have been proceed. Please pay.");
                remaining -= request;
                request = 0;
            } else {
                System.out.println("Sorry your request could not be processed");
                break;
            }
        }
    }
}
