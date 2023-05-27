package designPatterns.behavioralPatterns.visitor;

public class AreaVisitor implements ShapeVisitor {

    private double area;
    @Override
    public void visit(Circle circle) {
        area = Math.PI * circle.getRadius();
    }

    @Override
    public void visit(Square square) {
    area = square.getSideLength() * square.getSideLength();
    }

    @Override
    public void visit(Triangle triangle) {
    double p = (triangle.getSideA()+ triangle.getSideB()+ triangle.getSideC())/2;
    area = Math.sqrt(p*(p- triangle.getSideA()) * (p- triangle.getSideB())* (p- triangle.getSideC()));
    }

    public double getArea(){
        return area;
    }
}
