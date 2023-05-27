package designPatterns.behavioralPatterns.state;

public class TVStartState implements State {
    @Override
    public int doAction() {
        System.out.println("TV is turned ON");
        return 1;
    }
}
