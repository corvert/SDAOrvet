package advancedFeatures.lecture02.shape;

public class Rectangle extends Shape{
    public Rectangle(double height, double width) {
        super(height, width);
    }
    public double getArea(){
//        System.out.printf("Rectangle area is %.2f", getHeight()*getWidth());
//        System.out.println(" cm");
        return getHeight()*getWidth();
    }
    public double getPerimeter(){
//        System.out.printf("Rectangle perimeter is %.2f",(getHeight()+getWidth())*2);
//        System.out.println(" cm");
        return (getHeight()+getWidth())*2;
    }
}
