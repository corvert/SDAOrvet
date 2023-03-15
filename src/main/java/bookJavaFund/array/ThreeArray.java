package bookJavaFund.array;

public class ThreeArray {
    public static void main(String[] args) {
        int arr[][][] = new int[2][2][2];
        int no = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = no;
                    no++;
                    System.out.print(arr[i][j][k]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
