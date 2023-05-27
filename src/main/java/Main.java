

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.*;
import static java.util.Arrays.stream;


public class Main {
    public static void main(String[] args) {
        System.out.println(incrementString(""));
        System.out.println(incrementString("33275375531813209960"));
        System.out.println(incrementString("0000004617702678077138438340108"));

    }

    public static String incrementString(String str) {
        if (str.isEmpty())
            return "1";
        char lastChar = str.charAt(str.length()-1);
        if (!Character.isDigit(lastChar))
            return str + "1";
        String prefix = str.substring(0, str.length()-1);
        if (Character.digit(lastChar, 10) != 9)
            return prefix + (char)(lastChar + 1);
        return incrementString(prefix) + (char)(lastChar - 9);
    }
}


