package bookJavaFund.person;

public class Lecturer extends Person{
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Prof. James Gosling");
        lecturer.walk(20);
        lecturer.sleep();
        System.out.println(lecturer.getName());
        System.out.println(lecturer.getAge());
        lecturer.teachClass();
        lecturer.teachClass("Math");
    }
    public void teachClass(){
        System.out.println("Teaching a random class");
    }
    public void teachClass(String className){
        System.out.println("Teaching " + className);
    }
}
