package bookJavaFund.comparators;

import bookJavaFund.csv.User;

import java.util.Comparator;

public class ByIdComparator implements Comparator<User> {
    public int compare (User first, User second){
        return first.id.toLowerCase().compareTo(second.id.toLowerCase());
    }
}
