package designPatterns.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        System.out.println(SimpleSingleton.getInstance());
        System.out.println(SimpleSingleton.getInstance());
    }
}
