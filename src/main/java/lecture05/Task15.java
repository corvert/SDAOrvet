package lecture05;


import java.util.ArrayList;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<>();

        while (intArray.size() < 10) {
            System.out.println("Enter number #" + (intArray.size()+1) + ":");
            boolean inAnInt = sc.hasNextInt();
            if (inAnInt) {
                int n = sc.nextInt();
                intArray.add(n);
            } else {
                System.out.println("This is not a number");
            }
            sc.nextLine();
        }
        for (int i = 0; i < intArray.size(); i++) {
            for (int j = i + 1; j < intArray.size(); j++) {
                if (intArray.get(i) == intArray.get(j)) {
                    System.out.print("At least twice occurred ");
                    System.out.println(intArray.get(j));
                }
            }
        }
    }
}

