package advFeatLiveCoding.task06;

public class Task06Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getRadius());
        System.out.printf("%.2f\n", circle.circlePerimeter());
        System.out.printf("%.2f\n", circle.resize(2));

        Rectangle rectangle = new Rectangle(5,9);
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.rectanglePerimeter());
        System.out.println(rectangle.resize(2));
    }
}
