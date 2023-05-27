package designPatterns.behavioralPatterns.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();
        //create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");
        Observer obj4 = new MyTopicSubscriber("Obj4");
        Observer obj5 = new MyTopicSubscriber("Obj5");
        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        topic.register(obj4);
        topic.register(obj5);
        //attach observer to subject
        obj1.setSubject(topic);
        obj1.setSubject(topic);
        obj1.setSubject(topic);
        obj1.setSubject(topic);
        obj1.setSubject(topic);
        //check if any update is available
        obj1.update();
        //now send message to subject
        topic.postMessage("New message received");
        obj1.update();
        topic.postMessage("New message received2");
    }
}
