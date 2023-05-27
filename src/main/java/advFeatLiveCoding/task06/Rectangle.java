package advFeatLiveCoding.task06;

public class Rectangle implements  Resizable{

    private double width;
    private double height;

    public double rectanglePerimeter(){
        double perimeter = (width+height)*2;
        return perimeter;
    }

    @Override
    public double resize(double resizeBy) {
        return ((width+height)*resizeBy)*2;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
