package designPatterns.factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw method from Square");
    }

    @Override
    public int calculateArea() {
        return 3;
    }
}
