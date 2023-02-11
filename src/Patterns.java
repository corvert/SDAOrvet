import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
//        System.out.println("Insert rows You want: ");
//        Scanner scanner = new Scanner(System.in);
//        int rows = scanner.nextInt();


        int rows = 7;

//        triangleOne(rows);
//        System.out.println();
//        triangleTwo(rows);
//        System.out.println();
//        triangleThree(rows);
//        System.out.println();
//        triangleFour(rows);
//        System.out.println();
//        square(rows);
//        System.out.println();
//        letterS(rows);
//        System.out.println();
//        letterZ(rows);
//        System.out.println();
        hourglass(rows);


    }

    public static void triangleOne(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangleTwo(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangleThree(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangleFour(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int k = rows; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void square(int rows) {
        int i, j;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows)
                    System.out.print(" #");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void letterS (int rows){
        int k;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows; j++){
                if ((i == 1 || i == rows) || j == i)
                    System.out.print(" #");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void letterZ (int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows; j++){
                if (((i == 1 || i == rows) && j >= 1 && j <= rows)  || i+j == rows)
                    System.out.print(" #");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void hourglass (int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows; j++){
                if (i == 1 || i == rows && j == i || j == rows  - i)
                    System.out.print(" #");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}


