package bookJavaFund.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

public class UsersLoader {
    public static void loadUsersIntoSet(String pathToFile, Set<User> userSet) throws IOException {
        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader lineReader = new BufferedReader(fileReader);
        try (CSVReader reader = new CSVReader(lineReader)) {
            String[] row = null;
            while ((row = reader.readNow()) != null) {
                userSet.add(User.fromValues(row));
            }
        }
    }

    public static Hashtable<String, User> loadUsersInHashtableByEmail(String pathToFile) throws IOException {
        Hashtable<String, User> users = new Hashtable<>();
        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String[] row = null;
            while ((row = reader.readNow()) != null) {
                User user = User.fromValues(row);
                users.put(user.email, user);
            }
        }
        return users;
    }

    public static Vector<User> loadUsersInVector(String pathToFile) throws IOException {
        Vector<User> users = new Vector<>();
        BufferedReader lineReader = new BufferedReader(new FileReader(pathToFile));
        try (CSVReader reader = new CSVReader(lineReader)) {
            String[] row = null;
            while ((row = reader.readNow()) != null) {
                users.add(User.fromValues(row));
            }
        }
        return users;
    }
}
