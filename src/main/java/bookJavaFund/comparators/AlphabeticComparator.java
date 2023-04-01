package bookJavaFund.comparators;

import java.util.Comparator;

public class AlphabeticComparator implements Comparator<String> {
    public int compare(String first, String second){
        return first.toLowerCase().compareTo(second.toLowerCase());
    }

}
