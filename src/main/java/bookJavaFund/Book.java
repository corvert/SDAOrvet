package bookJavaFund;

import java.io.IOException;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stock");
        String stock = sc.nextLine();
        System.out.println("Enter " + stock + " day 1 value ");
        double dayOne = sc.nextDouble();
        System.out.println("Enter " + stock + " day 2 value");
        double dayTwo = sc.nextDouble();
        System.out.println(stock + " has changed " + (dayTwo/dayOne*100-100)  + "% in one day");

    }
}
