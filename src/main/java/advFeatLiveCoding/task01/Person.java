package advFeatLiveCoding.task01;

public class Person {
    private String fullName;
    private int age;
    private Gender gender;

    public Person(String fullName, int age, Gender gender) throws InvalidAgeException {
        if (age < 0 || age > 120) throw new InvalidAgeException("Age must be between 0 and 120");
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) throw new InvalidAgeException("Age must be between 0 and 120");
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
