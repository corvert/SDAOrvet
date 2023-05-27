package codeWars;

import java.util.Arrays;

public class SmallestIntegerFinder {
    /*
    Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
     */
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78,56,232,12,11,43}));
    }
    public static int findSmallestInt(int[] args) {
return Arrays.stream(args).min().getAsInt();
    }
}
