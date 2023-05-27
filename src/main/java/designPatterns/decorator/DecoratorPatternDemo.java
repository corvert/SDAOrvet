package designPatterns.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Car miniCar = new MiniCar();
        Car goldMiniCar = new GoldCarDecorator(new MiniCar());
        Car goldRacingCar = new GoldCarDecorator(new RacingCar());
        miniCar.create();
        System.out.println("MiniCar with Normal Color");
        goldMiniCar.create();
        System.out.println("MiniCar with Gold Color");
        goldRacingCar.create();
        System.out.println("RacingCar with Gold Color");
    }
}
