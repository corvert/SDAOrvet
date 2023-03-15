package first_program;

public class Task13 {
    public static void main(String[] args) {
        crossSum(123);
    }
    public static void crossSum(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            sum = sum + temp % 10;
            temp /= 10;

        }
        System.out.println(num + " cross sum is " + sum);
    }
}
