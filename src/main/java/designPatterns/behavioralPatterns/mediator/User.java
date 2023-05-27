package designPatterns.behavioralPatterns.mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg, User user);

    public ChatMediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }
}
