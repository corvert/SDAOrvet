package designPatterns.factory;

public class Retangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw method draw Retangle");
    }

    @Override
    public int calculateArea() {
        return 2;
    }
}
