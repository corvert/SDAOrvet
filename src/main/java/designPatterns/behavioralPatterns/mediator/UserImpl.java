package designPatterns.behavioralPatterns.mediator;

public class UserImpl extends User {

    UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " SEND message: " + msg);
        mediator.sendMessage (msg, this);
    }
    @Override
    public void receive(String msg, User user) {
        System.out.println(this.name + " GOT message: '" + msg + "' from " + user.getName());
    }


}
