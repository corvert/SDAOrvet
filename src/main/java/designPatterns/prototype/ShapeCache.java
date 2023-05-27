package designPatterns.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Square square1 = new Square();
        square1.setId("1");
        shapeMap.put(square1.getId(), square1);

        Square square2 = new Square();
        square2.setId("2");
        shapeMap.put(square2.getId(), square2);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);

    }
}
