package bookJavaFund.animals;

public class Cow implements AnimalBehavior, AnimalListener{

    String sound;
    String movementType;
    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.move();
        myCow.makeSound();
    }
    @Override
    public void move(){
        this.movementType = "Walking";
        this.onAnimalMoved();

    }
    @Override
    public void makeSound(){
        this.sound = "Moo";
        this.onAnimalSound();
    }
    @Override
    public void onAnimalMoved(){
        System.out.println("Animal moved " + this.movementType);

    }
    @Override
    public void onAnimalSound(){
        System.out.println("Sound made " + this.sound);

    }
}
