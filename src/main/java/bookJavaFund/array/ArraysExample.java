package bookJavaFund.array;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        double[] myArray = {0.0, 1.0, 2.0, 3,4,5,6,7.0,8,9};
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        int index = Arrays.binarySearch(myArray, 7);
        System.out.println("Position of 7 is " + index);
    }
}
