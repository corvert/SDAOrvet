package bookJavaFund.csv;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class FindUserHashtable {
    public static void main(String[] args) throws IOException {
        Hashtable users = UsersLoader.loadUsersInHashtableByEmail("users.csv");
        System.out.printf("Loaded %d unique users.\n", users.size());
        System.out.println("Type a user e-mail: ");
        try (Scanner userInput = new Scanner(System.in)) {
            String email = userInput.nextLine();

            if (!users.containsKey(email)){
                //User email not i file
                System.out.printf("Sorry, user with email %s not found \n", email);
                return;
            }
            User user = (User) users.get(email);
            System.out.printf("User with email %s found", email);
            System.out.printf("ID: %s, Name %s", user.id, user.name);
        }
    }
}
