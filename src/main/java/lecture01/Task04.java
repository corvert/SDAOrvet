package lecture01;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++){
            if (i % 3 == 0 && i % 7 == 0){
                System.out.println("Fizz buzz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
