package designPatterns.behavioralPatterns.templateMethod;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football is initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football is started");
    }

    @Override
    void endPlay() {
        System.out.println("Football is ended");
    }
}
