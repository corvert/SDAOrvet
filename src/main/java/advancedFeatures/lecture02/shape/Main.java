package advancedFeatures.lecture02.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7,7);

        System.out.printf("Circle area is %.2f cm\n", circle.getArea());
        System.out.printf("Circle perimeter is %.2f cm\n", circle.getPerimeter());

        Shape square = new Square(5,5);

        System.out.printf("Square area is %.2f cm\n", square.getArea());
        System.out.printf("Square perimeter is %.2f cm\n", square.getPerimeter());

        Shape rectangle = new Rectangle(4,8);

        System.out.printf("Rectangle area is %.2f cm\n", rectangle.getArea());
        System.out.printf("Rectangle perimeter is %.2f cm\n", rectangle.getPerimeter());
    }
}
