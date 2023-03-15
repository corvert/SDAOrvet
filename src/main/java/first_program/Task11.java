package first_program;

public class Task11 {
    public static void main(String[] args) {
        swapVariables(5, 13);
    }
    public static void swapVariables(int a1, int b1) {
        int temp;
        temp = a1;
        a1 = b1;
        b1 = temp;

        System.out.println("a = " + a1 + " b = " + b1);
    }
}
