package designPatterns.behavioralPatterns.state;

public class TVRemote {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStart = new TVStartState();
        State tvStop = new TVStopState();
        State tvSwitch = new TvSwitchState();
        State volUp = new TvVolUp();
        State volDown = new TvVolDown();
        context.setTvState(tvStart);
        context.doAction();
        context.setTvState(tvStop);
        context.doAction();
        context.setTvState(tvSwitch);
        context.doAction();
        context.setTvState(volUp);
        context.doAction();
        context.setTvState(volDown);
        context.doAction();
    }
}
