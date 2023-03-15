package lecture01;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pos number");
        int n = sc.nextInt();
        double h = 0;
        for (int i = 1; i <= n; i++) {
            h += (double) 1 / i;
        }
        System.out.println(n + " harmonic sum is " + h);
    }
}
