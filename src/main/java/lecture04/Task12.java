package lecture04;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text here");
        String text = sc.nextLine();
        double count = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                count++;
            }
        }
        System.out.printf("Occurrences of a space character is %.4f", count * 100 / text.length());
        System.out.println("%");
    }
}
