package designPatterns.behavioralPatterns.visitor;

public abstract class Shape {
    public abstract void accept(ShapeVisitor visitor);
}
