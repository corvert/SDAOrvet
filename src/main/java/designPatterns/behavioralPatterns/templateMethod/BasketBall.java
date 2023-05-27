package designPatterns.behavioralPatterns.templateMethod;

public class BasketBall extends Game{
    @Override
    void initialize() {
        System.out.println("BasketBall is initialized");
    }

    @Override
    void startPlay() {
        System.out.println("BasketBall is started");
    }

    @Override
    void endPlay() {
        System.out.println("BasketBall is ended");
    }
}
