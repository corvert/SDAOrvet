package bookJavaFund.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exercise49 {
    private static List<Integer> parseIntegers(List<String> inputList) {
        List<Integer> integers = new ArrayList<>();
        for (String s : inputList) {
            integers.add(Integer.parseInt(s));
        }
        return integers;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("1");
        inputList.add("two");
        inputList.add("3");
        try {
            List<Integer> outputList = parseIntegers(inputList);

            int sum = 0;
            for (Integer i : outputList) {
                sum += i;
            }
            System.out.println("Sum is " + sum);
        } catch (NumberFormatException e) {
            System.out.println("There was a non-number element in the list. Rejecting");
        }
    }
}
