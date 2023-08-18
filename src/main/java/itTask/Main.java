package itTask;

import java.time.LocalDate;

public class Main {

//    Create a Person class in Java that can be initialised with name, email, and phone number.
//    Example:
//    Person person1 = new Person("John Smith", "john.smith@example.com", 1234567890L);
//    Create another class based on the Person class called Customer. The Customer class should have balance and registration date.
//    Example:
//    Customer customer1 = new Customer("Jane Doe", "jane.doe@example.com", 0987654321L, 20.40, new Date());
//    Add a method sayHello(), it should return “hello person” if an instance of Person is created and “hello customer” if an instance of Customer is created.
//    Example:
//            System.out.println(customer1.sayHello()); // "hello customer"
//System.out.println(person1.sayHello()); // "hello person"
//    Add a method introduce(), which should return name and phone number.
//    Example:
//            System.out.println(customer1.introduce()); // {name: "Jane Doe", phoneNumber: "0987654321"}
//System.out.println(person1.introduce()); // {name: "John Smith", phoneNumber: "1234567890"}

    public static void main(String[] args) {
        Person person = new Person("John", "jhon@example.com", 1234567890L);
        Customer customer = new Customer(new Person("jane", "jane@example.com", 9876L), 20.40, LocalDate.now());

        System.out.println(person.sayHello());
        System.out.println(customer.sayHello());

        System.out.println(customer.introduce());
        System.out.println(person.introduce());

    }

  

}
