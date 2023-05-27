package designPatterns.behavioralPatterns.templateMethod;

public class Tennis extends Game{
    @Override
    void initialize() {
        System.out.println("Tennis: Game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Tennis: Game started");
    }

    @Override
    void endPlay() {
        System.out.println("Tennis: Game ended");
    }
}
