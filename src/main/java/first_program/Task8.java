package first_program;

public class Task8 {
    public static void main(String[] args) {
        circle(7.5);
    }


    public static void circle(double radius) {
        double area = Math.PI * (radius * radius);
        {
            System.out.println("Circle area: " + area);
        }
        double perimeter = 2 * Math.PI * radius;
        {
            System.out.println("Circle perimeter: " + perimeter);
        }
    }
}