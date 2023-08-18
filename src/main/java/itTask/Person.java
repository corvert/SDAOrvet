package itTask;

public class Person extends Hello {
    public String name;
    public String email;
    public Long phoneNumber;

    public Person(String name, String email, Long phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String sayHello() {
       return "Hello Person";
    }

    @Override
    public String introduce() {
        return getName() +", " +  getPhoneNumber();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }
}
