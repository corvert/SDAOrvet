package advancedFeatures;

public class Ball {
    //fields = features
    boolean isRound = true;
    int diameter;

    // constructor
    public Ball(boolean isRound, int diameter){
        this.isRound = isRound;
        this.diameter = diameter;
    }

    //setter and getter
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public int getDiameter(){
        return diameter;
    }

    //Methods = behaviour
    void bounce(){
        System.out.println("The ball bounced");
    }

    static void keepBallRound(){
        System.out.println("Keeping ball round");
    }
}
