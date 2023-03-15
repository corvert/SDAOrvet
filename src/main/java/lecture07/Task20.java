package lecture07;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumb = random.nextInt(101);

        boolean endGame = false;
        System.out.println("Guess number between 0 and 100");
        while (!endGame) {
            int n = sc.nextInt();
            if (n < randomNumb) {
                System.out.println("not enough");
            } else if (n > randomNumb) {
                System.out.println("too much");
            } else {
                System.out.println("Congratulations");
                endGame = true;
            }
        }
    }
}


