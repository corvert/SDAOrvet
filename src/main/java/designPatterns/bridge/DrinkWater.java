package designPatterns.bridge;

public class DrinkWater implements DrinkPurchase{
    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying water with: " + cost);
        return new Water();
    }
}
