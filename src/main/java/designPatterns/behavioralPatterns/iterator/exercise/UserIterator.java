package designPatterns.behavioralPatterns.iterator.exercise;

public class UserIterator implements Iterator {
    User users[] = {new User("robert1234"), new User("john5678"), new User("mike4579")};
    private int index;

    @Override
    public boolean hasNext() {
        if (index < users.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return users[index++];
        }
        return null;
    }
}
