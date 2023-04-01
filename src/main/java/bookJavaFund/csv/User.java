package bookJavaFund.csv;

public class User {

    public static User fromValues(String [] values) {
        String id = values[0];
        String name = values[1];
        String email = values[2];
        return new User(id, name, email);
    }

    public String id;
    public String name;
    public String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
