package designPatterns.behavioralPatterns.mediator;

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User lisa = new UserImpl(mediator, "Lisa");
        User mark = new UserImpl(mediator,"Mark");
        User ewert = new UserImpl(mediator, "Ewert");
        User pille = new UserImpl(mediator, "Pille");

        mediator.addUser(lisa);
        mediator.addUser(mark);
        mediator.addUser(ewert);
        mediator.addUser(pille);

        lisa.send("hi");
        ewert.send("Hello everybody");


    }
}
