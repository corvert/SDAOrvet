package advancedFeatures.lecture02;

import java.util.ArrayList;
import java.util.List;

public class ListAnimal {

    private List<Animal> animalList;

    public ListAnimal() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimalList(Animal animal){
        animalList.add(animal);
    }

    public void printAnimalList(){
        System.out.println("Animals in zoo ");
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(
                    animalList.get(i).getType() + " - "
                            + animalList.get(i).getName()
                            + " (" + animalList.get(i).getAge()
                            + " years old)");

        }
    }
}
