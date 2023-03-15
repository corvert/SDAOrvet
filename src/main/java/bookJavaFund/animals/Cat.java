package bookJavaFund.animals;

public class Cat extends Animal {

    String owner;
    int numberOfTeeth;
    int age;

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setFamily("Cat");
        myCat.setName("Puppy");
        myCat.ears = 2;
        myCat.legs = 4;
        myCat.eyes = 2;
        myCat.owner = "John";

        System.out.println(myCat.getFamily());
        System.out.println(myCat.getName());
        System.out.println(myCat.ears);
        System.out.println(myCat.legs);
        System.out.println(myCat.eyes);
    }

}
