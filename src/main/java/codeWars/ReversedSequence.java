package codeWars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedSequence {
    /*
    Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }
    public static int[] reverse(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n-i;
        }
        return result;
    }
    public static int[] reverse1(int n){

        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }
}
