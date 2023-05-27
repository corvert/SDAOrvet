package designPatterns.behavioralPatterns.templateMethod;

public class IceHockey extends Game{
    @Override
    void initialize() {
        System.out.println("IceHockey is initialized");
    }

    @Override
    void startPlay() {
        System.out.println("IceHockey is started");
    }

    @Override
    void endPlay() {
        System.out.println("IceHockey is ended");
    }
}
