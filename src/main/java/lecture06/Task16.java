package lecture06;

import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        ArrayList<Integer> integers = new ArrayList<>();

        while (counter < 10) {
            System.out.println("Enter number #" + (counter + 1));
            boolean inAnInt = sc.hasNextInt();
            if (inAnInt) {
                int n = sc.nextInt();
                integers.add(n);
                counter++;
            } else {
                System.out.println("This is not number");
            }
            sc.nextLine();
        }
        int subSeqCount = 1;
        int result = 0;
        System.out.println(integers);
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i - 1) < integers.get(i)) {
                subSeqCount++;
            } else {
                subSeqCount = 1;
            }
            result = Math.max(result, subSeqCount);
        }
        System.out.println(result);
    }
}
