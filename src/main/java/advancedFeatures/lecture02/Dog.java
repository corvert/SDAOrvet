package advancedFeatures.lecture02;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age, "mammal");
    }

    // NOTE: When you inherit an abstract class, you have two choices:
    // - Either you implement the abstract methods that have been inherited
    // - You make the class that is inheriting an abstract class itself.

    public void makeSound() {
        System.out.println("Woof!");
    }
}
