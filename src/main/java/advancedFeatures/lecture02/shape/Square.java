package advancedFeatures.lecture02.shape;

public class Square extends Shape{
    public Square(double height, double width) {
        super(height, width);
    }

    public double getArea(){
//        System.out.printf("Square area is %.2f", getHeight()*getWidth());
//        System.out.println(" cm");
        return getHeight()*getWidth();
    }
    public double getPerimeter(){
//        System.out.printf("Square perimeter is %.2f",(getHeight()+getWidth())*2);
//        System.out.println(" cm");
        return (getHeight()+getWidth())*2;
    }
}
