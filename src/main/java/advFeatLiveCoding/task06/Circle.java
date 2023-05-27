package advFeatLiveCoding.task06;

public class Circle implements Resizable{

    private double radius;

    public double circlePerimeter(){
        double perimeter = Math.PI * (Math.pow(radius, 2));
        return perimeter;
    }

    @Override
    public double resize(double resizeBy) {
        return Math.pow((radius*resizeBy),2)*Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
