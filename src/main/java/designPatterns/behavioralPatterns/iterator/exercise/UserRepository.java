package designPatterns.behavioralPatterns.iterator.exercise;

public class UserRepository implements Container {


    @Override
    public Iterator getUserIterator() {
        return new UserIterator();
    }
}
