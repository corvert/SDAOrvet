package designPatterns.behavioralPatterns.mediator;

public interface ChatMediator {
    void sendMessage (String msg, User sender);
    void addUser(User user);

}
