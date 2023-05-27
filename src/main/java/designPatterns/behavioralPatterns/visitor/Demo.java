package designPatterns.behavioralPatterns.visitor;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(10);
        Shape triangle = new Triangle(3,4,5);

        AreaVisitor areaVisitor = new AreaVisitor();
        circle.accept(areaVisitor);
        System.out.println(areaVisitor.getArea());
        square.accept(areaVisitor);
        System.out.println(areaVisitor.getArea());
        triangle.accept(areaVisitor);
        System.out.println(areaVisitor.getArea());
    }
}
