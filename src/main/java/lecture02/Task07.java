package lecture02;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        int count = 0;

        while (count < n){
            sum = a+b;
            a = b ;
            b = sum;
            count++;
        }
        System.out.println(a);
    }
}

