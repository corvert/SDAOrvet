package advFeatLiveCoding.task01;

public class PersonMain {
    public static void main(String[] args) throws InvalidAgeException {
        Person fred = new Person("Fred", 21, Gender.MALE);
        PersonDatabase personDatabase = new PersonDatabase();
        personDatabase.addPerson(fred);


    }
}
