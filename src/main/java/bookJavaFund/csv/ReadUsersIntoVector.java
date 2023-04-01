package bookJavaFund.csv;

import java.io.IOException;
import java.util.Vector;

public class ReadUsersIntoVector {
    public static void main(String[] args) throws IOException {
        Vector users = UsersLoader.loadUsersInVector("users.csv");
        System.out.println(users.size());

    }
}
