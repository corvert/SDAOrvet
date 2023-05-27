package designPatterns.factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RETANGLE")) {
            return new Retangle();
        } else {
            return new Square();
        }
    }
}
