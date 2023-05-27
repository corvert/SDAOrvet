package codeWars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpandedForm1 {
    public static void main(String[] args) {
        System.out.println(expandedForm(12));
    }

    public static String expandedForm(int num) {
        String[] str = Integer.toString(num).split("");
        String result = "";
        String st = "";
        for (int i = 0; i < str.length - 1; i++) {
            if (Integer.valueOf(str[i]) > 0) {
                for (int j = i; j < str.length - 1; j++) {
                    str[i] += '0';
                }
            }
        }
        for (String s : str) {
            st += s + " ";
        }
        result = st;
        result = result.substring(0, result.length() - 1).replace(" 0", "").replace(" ", " + ");
        System.out.println(result);
        return result;
    }

    public static String expandedForm1(int num) {
        return IntStream.range(0, String.valueOf(num).length())
                .mapToObj(x -> String.valueOf(Character.getNumericValue(String.valueOf(num)
                        .charAt(x)) * (int) Math.pow(10, String.valueOf(num).substring(x).length() - 1)))
                .filter(x -> !x.equals("0"))
                .collect(Collectors.joining(" + "));
    }
}

