package lecture04;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text here");
        String text = sc.nextLine();
        String[] textArray = text.split(" ");
        for (String tx : textArray ){
            System.out.print (tx + " " + tx + " ");
        }
    }
}
