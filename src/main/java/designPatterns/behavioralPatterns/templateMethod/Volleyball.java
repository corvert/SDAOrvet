package designPatterns.behavioralPatterns.templateMethod;

public class Volleyball extends Game{
    @Override
    void initialize() {
        System.out.println("Volleyball is initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Volleyball is started");
    }

    @Override
    void endPlay() {
        System.out.println("Volleyball is ended");
    }
}
