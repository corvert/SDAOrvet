package advFeatLiveCoding.task09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your text");
        String text = sc.nextLine();
        String []arrayText = text.split("[ ,.!?]");
        String longest = Arrays.stream(arrayText).max(Comparator.comparingInt(String::length)).get();

        System.out.println(longest);

    }
}
