package designPatterns.behavioralPatterns.state;

import designPatterns.behavioralPatterns.state.State;

public class TvSwitchState implements State {
    @Override
    public int doAction() {
        System.out.println("switch state");
        return 2;
    }
}
