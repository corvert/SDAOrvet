package designPatterns.behavioralPatterns.state;

public class TvVolDown implements State {
    @Override
    public int doAction() {
        System.out.println("TV vol is down");
        return 4;
    }
}
