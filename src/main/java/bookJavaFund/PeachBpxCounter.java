package bookJavaFund;

import java.util.Scanner;

public class PeachBpxCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfBoxesShiped = 0;
        int numberOfPeaches = 0;
        while (true){
            System.out.println("Enter the number of peaches picked:");
            int incomingNumbreOfPeaches = sc.nextInt();
            if (incomingNumbreOfPeaches == 0){
                break;
            }
            numberOfPeaches += incomingNumbreOfPeaches;
            while (numberOfPeaches >= 20){
                numberOfPeaches -= 20;
                numberOfBoxesShiped += 1;
                System.out.printf("%d boxes shipped, %d peaches remaining\n", numberOfBoxesShiped, numberOfPeaches);
            }
        }
    }
}
