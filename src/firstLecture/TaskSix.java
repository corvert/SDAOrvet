package firstLecture;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pos number");
        int n = sc.nextInt();
        double h = 0;
        for (int i = 1; i <= n; i++) {
            h = h + (double) 1 / i;
        }
        System.out.println(h);
    }
}
