package codeWars;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class KataInvert {
    /*
    Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{-1, -2, -3, -4, -5})));
    }

    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i]*(-1);
        }
        return result;
    }
    public static int[] invert1(int[] array) {
        return Arrays.stream(array).map(i -> -i).toArray();
    }
}
