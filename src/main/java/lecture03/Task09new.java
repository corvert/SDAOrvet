package lecture03;

import java.util.Scanner;

public class Task09new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waves = sc.nextInt();
        if (waves < 0) {
            return;
        }
        char[][] pattern = {
                {'*', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', '*'},
                {' ', '*', ' ', ' ', ' ', ' ', '*', ' ', ' ', '*', ' ', ' ', ' ', '*', ' '},
                {' ', ' ', '*', ' ', ' ', '*', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' '},
                {' ', ' ', ' ', '*', '*', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' '},
        };

        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0, k = 0; j < waves; j++, k++) {
                System.out.print(pattern[i][k]);
                if (pattern[i].length == k + 1) {
                    k = -1;
                }
            }
            System.out.println();
        }
    }
}
