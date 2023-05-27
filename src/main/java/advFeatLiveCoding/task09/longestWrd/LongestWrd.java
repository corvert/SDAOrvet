package advFeatLiveCoding.task09.longestWrd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWrd {
    public static void main(String[] args) {
        List<String> words = readWords();

        String longest = findLongest(words, word -> word.length());
        String longest1 = findLongest(words, String::length);
        System.out.println(longest);
        System.out.println(longest1);
    }


    private static List<String> readWords() {
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        System.out.println("Enter words (one per line, enter an empty line to stop)");

        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            words.add(line);
        }
        sc.close();
        return words;
    }

    private static <T> T findLongest(List<T> list, LengthFunction<T> function) {
        T longest = null;

        int maxLength = 0;

        for (T element : list) {
            int length = function.getLength(element);
            if (length > maxLength) {
                longest = element;
                maxLength = length;
            }
        }
        return longest;
    }
}
