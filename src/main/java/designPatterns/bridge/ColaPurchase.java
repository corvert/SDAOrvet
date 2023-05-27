package designPatterns.bridge;

public class ColaPurchase implements DrinkPurchase{
    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying Cola with: " + cost);
        return new Cola();
    }
}
