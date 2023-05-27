package designPatterns.behavioralPatterns.state;

public class TvVolUp implements State {
    @Override
    public int doAction() {
        System.out.println("TV vol is up");
        return 3;
    }
}
