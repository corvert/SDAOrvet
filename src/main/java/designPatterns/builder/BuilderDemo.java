package designPatterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .pepperoni(true)
                .cheese(true)
                .pineapple(true)
                .build();

        System.out.println(pizza);
    }
}
