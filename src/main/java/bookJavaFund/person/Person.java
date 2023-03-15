package bookJavaFund.person;

public class Person {

    int age;
    int height;
    String name;

//    Person me = new Person(30);
//    Person myNeighbour = new Person();
//    Person lecturer = new Person();


    public Person(int age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public Person(int myAge, int myHeight){
        this.age = myAge;
        this.height = myHeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int myAge) {
        this.age = myAge;
    }

    public Person() {
        this(28, 10, "James");
    }

    public void walk(int speed) {
        if (speed > 10) {
            System.out.println("Walking ...");
        }
    }

    public void sleep() {
        System.out.println("Spleeping ...");
    }

    public void takeShower() {
        System.out.println("Taking a shower ...");
    }
}
