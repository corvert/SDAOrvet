package first_program;

public class Task9 {
    public static void main(String[] args) {
        average();
    }
    public static void average() {
        double[] array = {10, 20, 30};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
    }
}
