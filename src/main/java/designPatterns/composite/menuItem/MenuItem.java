package designPatterns.composite.menuItem;

public class MenuItem implements Item {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void addItem(Item newItem) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeItem(Item item) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println(name +" : " + price);
    }
}
