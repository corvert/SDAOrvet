package advancedFeatures.lecture01;

public class PersonTest {
    public static void main(String[] args) {
        Person david = new Person("David", "Frank", 12);
        Employee employee = new Employee("James", "Lebron",38,"Player", 32);

        System.out.println(employee.getFirstName());
    }
}
