package designPatterns.factory;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw method from Circle");
    }

    @Override
    public int calculateArea() {
        return 1;
    }
}
