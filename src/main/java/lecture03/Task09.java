package lecture03;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stars in wave");
        int num = sc.nextInt();

        String[][] array = new String[4][11];
        array[0][0] = "*";
        array[1][1] = "*";
        array[2][2] = "*";
        array[3][3] = "*";
        array[3][4] = "*";
        array[2][5] = "*";
        array[1][6] = "*";
        array[0][7] = "*";
        array[0][8] = "*";
        array[1][9] = "*";
        array[2][10] = "*";


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < num; j++) {
              if (array[i][j] != null) {
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }
    }
}

