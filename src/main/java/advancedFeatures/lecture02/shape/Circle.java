package advancedFeatures.lecture02.shape;

public class Circle extends Shape{
    public Circle(double height, double width) {
        super(height, width);
    }

    public double getArea(){
//        System.out.printf("Circle area is %.2f", Math.PI * getWidth());
//        System.out.println(" cm");
        return Math.PI * getWidth();
    }

    public double getPerimeter(){
//        System.out.printf("Circle perimeter is %.2f", Math.PI * getWidth());
//        System.out.println(" cm");
        return Math.PI * getWidth();
    }
}
