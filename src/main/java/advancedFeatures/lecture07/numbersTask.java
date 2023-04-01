package advancedFeatures.lecture07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();

        while (count < 5) {
            System.out.println("Enter #" + (count + 1));
            int n = sc.nextInt();
            if (n % 2 == 0) {
                evenNum.add(n);
            } else {
                oddNum.add((n));
            }
            count++;
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenNum.size(); i++) {
            System.out.println(evenNum.get(i));
        }

        System.out.println("Odd Number:");
        for (int i = 0; i < oddNum.size(); i++) {
            System.out.println(oddNum.get(i));
        }
    }
}
