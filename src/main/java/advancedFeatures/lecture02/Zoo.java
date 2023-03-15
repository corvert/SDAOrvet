package advancedFeatures.lecture02;

public class Zoo {
    // an array initialized with objects is set to null for the size of the array
    private Animal[] animals;
    private int numOfAnimals; // counter for how many animals are in the current zoo

    // We'll use the constructor to initialize the size of the zoo.
    public Zoo(int maxSize) {
        animals = new Animal[maxSize];
        numOfAnimals = 0;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        if (numOfAnimals < animals.length) {
            animals[numOfAnimals] = animal;
            numOfAnimals++;
        } else {
            System.out.println("Zoo is full!");
        }
    }

    public void printAnimals() {
        System.out.println("Animals in the zoo include: ");

        for (int i = 0; i < numOfAnimals; i++) {
            Animal animal = animals[i]; // the current animal in iteration
            System.out.println(
                    animal.getType() + " - "
                            + animal.getName()
                            + " (" + animal.getAge()
                            + " years old)");
        }
    }
}