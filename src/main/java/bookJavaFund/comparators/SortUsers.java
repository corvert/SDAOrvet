package bookJavaFund.comparators;

import bookJavaFund.csv.User;
import bookJavaFund.csv.UsersLoader;

import java.io.IOException;
import java.util.*;

public class SortUsers {
    public static void main(String[] args) throws IOException {
        Hashtable<String, User> uniqueUsers = UsersLoader.loadUsersInHashtableByEmail("users.csv");
        Vector<User> users = new Vector<>(uniqueUsers.values());
        Scanner reader = new Scanner(System.in);
        System.out.println("What field You want to sort by: ");
        String input = reader.nextLine();

        Comparator<User> comparator;
        switch (input){
            case "id":
                comparator = new ByIdComparator();
                break;
            case "name":
                comparator = new ByNameComparator();
                break;
            case "email":
                comparator = new ByEmailComparator();
                break;
            default:
                System.out.printf("Sorry, invalid option %s", input);
                return;
        }
        System.out.printf("Sorting be %s\n", input);
        Collections.sort(users, comparator);

        for (User user : users){
            System.out.printf("%s - %s, %s\n", user.id, user.name, user.email);
        }
    }
}
