package lecture01;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int isPrime = 0;

        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == 1)
                continue;
                isPrime = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime == 1) {
                System.out.println(i);
            }
        }
    }
}
