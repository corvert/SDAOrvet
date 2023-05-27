package designPatterns.composite.menuItem;

public interface Item {
    void addItem(Item newItem);
    void removeItem(Item item);
    double getPrice();
    String getName();
    void display();
}
