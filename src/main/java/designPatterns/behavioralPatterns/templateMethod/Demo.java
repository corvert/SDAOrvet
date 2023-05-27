package designPatterns.behavioralPatterns.templateMethod;

public class Demo {
    public static void main(String[] args) {
        Game tennis = new Tennis();
        tennis.play();

        Game basketBall = new BasketBall();
        basketBall.play();
    }
}
