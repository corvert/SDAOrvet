package bookJavaFund.person;

public class Student extends Person{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("James Gosling");
        student.walk(20);

        student.sleep();
        System.out.println(student.getName());
        System.out.println(student.getAge());

        student.goToGlass();
        student.goToGlass(6);
    }
    @Override
    public void walk(int speed){
        System.out.println("Walking to class...");
    }
    public @interface Author{
        String name();
        String date();
    }
    @Author(name = "James Gosling", date = "1/1/1970")

    public void goToGlass(){
        System.out.println("Going to class ...");
    }
    public void goToGlass(int dayOfWeek){
        if (dayOfWeek == 6 || dayOfWeek == 7){
            System.out.println("it's the weekend! Not to going to class!");
        } else {
            System.out.println("Going to class ...");
        }
    }

}
