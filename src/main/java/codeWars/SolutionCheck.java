package codeWars;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class SolutionCheck {
    /*
    You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

Array can contain numbers or strings. X can be either.

Return true if the array contains the value, false if not.
     */
    public static void main(String[] args) {
        System.out.println(check(new Object[] {'t', 'e', 's', 't'}, 'a'));
    }

    public static boolean check(Object[] a, Object x) {
        for (Object e : a)
            if (e == x || x.equals(e))
                return true;


        //return Stream.of(a).anyMatch(i->i == x);
        return false;
    }
}
