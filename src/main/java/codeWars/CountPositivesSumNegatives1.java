package codeWars;

import java.util.Arrays;
/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers
and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */

public class CountPositivesSumNegatives1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives
                (new int[]{})));
    }
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        } else {
            int count = 0;
            int sum = 0;
            for (int i : input) {
                if (i > 0) {
                    count++;
                }
            }
            for (int p : input) {
                if (p < 0) {
                    sum += p;
                }
            }
            return new int[]{count, sum};
        }
    }
}
