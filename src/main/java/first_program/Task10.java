package first_program;

public class Task10 {
    public static void main(String[] args) {
        rectangle(5.5, 8.5);
    }
    public static void rectangle(double width, double height) {
        double rectangleArea = width * height;
        System.out.println("Rectangle area is: " + rectangleArea);
        double rectanglePeri = 2 * (width + height);
        System.out.println("Rectangle perimeter is: " + rectanglePeri);
    }
}
