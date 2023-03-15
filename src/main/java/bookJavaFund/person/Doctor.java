package bookJavaFund.person;

public class Doctor implements PersonBehavior, PersonListener{
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.walk(20);
        myDoctor.sleep();
    }
    @Override
    public void breathe(){

    }
    @Override
    public void sleep(){
        //TODO
        this.onPersonSleeping();

    }

    @Override
    public void walk(int speed){
        this.onPersonWalking();

    }
    @Override
    public void onPersonWalking(){
        System.out.println("Event: onPersonWalking");
    }
    @Override
    public void onPersonSleeping(){
        System.out.println("Event: onPersonSleeping");
    }

}
