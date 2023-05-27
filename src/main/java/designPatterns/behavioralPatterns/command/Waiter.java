package designPatterns.behavioralPatterns.command;

public class Waiter {
    void placeOrder(Order order){
        order.execute();
    }
}
