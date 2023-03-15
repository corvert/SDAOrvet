package bookJavaFund.animals;

import bookJavaFund.animals.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Cow myCow = new Cow();
        myCat.owner = "John";
        System.out.println(myCat.owner);

        Animal animal = (Animal)myCat;
        //System.out.println(animal.owner);
        System.out.println(myCow.sound);

        //Animal animal1 = (Animal)myCow;
        Cat cat = (Cat) animal;
        System.out.println(cat.owner);
    }
}
