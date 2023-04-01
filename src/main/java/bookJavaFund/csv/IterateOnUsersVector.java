package bookJavaFund.csv;

import java.io.IOException;
import java.util.Vector;

public class IterateOnUsersVector {
    public static void main(String[] args) throws IOException {
        Vector users = UsersLoader.loadUsersInVector("users.csv");
        for (Object userAsObject : users){
            User user = (User) userAsObject;
            System.out.printf("%s - %s\n", user.name, user.email);
        }
    }
}
