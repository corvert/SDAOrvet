package designPatterns.flyweight;

public class Rectangle implements Shape{
    private String color;
    private int x;
    private int y;
    private int sideA;
    private int sideB;

    public Rectangle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Circle: drw() [Color: " + color + ", x: " + x +" , y: " + y + " sideA " + sideA + " sideB " +sideB);
    }
}
