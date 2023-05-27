package designPatterns.behavioralPatterns.state;

public class TVContext implements State{

    private State tvState;

    public State getTvState() {
        return tvState;
    }

    public void setTvState(State state) {
        this.tvState = state;
    }

    @Override
    public int doAction() {
        return this.tvState.doAction();
    }
}
