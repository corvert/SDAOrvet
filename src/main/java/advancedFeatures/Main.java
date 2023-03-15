package advancedFeatures;

import advancedFeatures.lecture02.Animal;
import advancedFeatures.lecture02.Dog;
import advancedFeatures.lecture02.Eagle;

public class Main {

    // A Class is a blueprint for creating an object
    // an INSTANCE is the construction of Your object
    //static makes sure that the item it is called on maintains only one instance of itself.
    //
    // Ball is round - feature
    // Ball has diameter - feature

    // Ball bounces
    //

    public static void main(String[] args) {
        Ball leatherBall = new Ball(true, 40); // instance of the object
        System.out.println("The diameter of the ball is " + leatherBall.diameter);

        Ball paperBall = new Ball(true,10);

        Ball americanFootball = new Ball(false,30);
        leatherBall.bounce(); // a call to the INSTANCE method 'bounce'



        Ball.keepBallRound();

        Animal animal = new Eagle("Bingo",3);
    }
}
