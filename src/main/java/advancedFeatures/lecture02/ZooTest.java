package advancedFeatures.lecture02;

import java.util.Arrays;

public class ZooTest {
    public static void main(String[] args) {
        Zoo germanZoo = new Zoo(4);

        // Abstraction between type of Animal and the actual animal
        Animal bingo = new Dog("Bingo", 3);
        Animal harry = new Eagle("Harry", 5);

        germanZoo.addAnimal(bingo);
        germanZoo.addAnimal(harry);

        System.out.println(Arrays.toString(germanZoo.getAnimals()));

        germanZoo.printAnimals();
    }
}
