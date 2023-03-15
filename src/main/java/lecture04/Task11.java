package lecture04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text ");
        ArrayList<String> textInArray = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            String text = sc.nextLine();
            textInArray.add(text);
            if (text.equals("Enough!")) {
                exit = true;
                textInArray.remove(textInArray.size() - 1);
            }
        }
        if (textInArray.isEmpty()){
            System.out.println("No text provided");
        } else {
            System.out.println("Longest string is " + textInArray.stream().max(Comparator.comparingInt(String::length)).get());
        }
    }
}
