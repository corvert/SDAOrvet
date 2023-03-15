package advancedFeatures.lecture02;


public abstract class Animal {
    // An abstract class is a blueprint for defining aspects of
    // an object that you want to be inherited by other objects.

    // An abstract class is also the only type of class that can hold abstract methods.

    // Abstract methods are methods that do not have a body, and also has the abstract
    // keyword in its method definition.

    private String name;
    private int age;
    private String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public abstract void makeSound();

}