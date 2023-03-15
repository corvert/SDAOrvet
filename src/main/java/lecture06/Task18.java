package lecture06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("ach(o+)!");
        Matcher matcher = pattern.matcher(text);
        boolean match = matcher.find();
        if (match) {
            System.out.println("Bless You");
        }
    }
}

