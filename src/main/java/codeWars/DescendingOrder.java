package codeWars;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc2(54341));
    }

    public static int sortDesc(final int num) {
        char[] numArray = String.valueOf(num).toCharArray();
        Arrays.sort(numArray);
        return Integer.parseInt(new StringBuilder(new String(numArray)).reverse().toString());
    }
    public static int sortDesc1(final int num){
        return Integer.toString(num).chars().mapToObj(i -> String.valueOf(i - '0')).sorted(Comparator.reverseOrder())
                .reduce(String::concat).map(Integer::valueOf).get();
    }
    public static int sortDesc2(final int num) {
        char[] numArray = String.valueOf(num).toCharArray();
        char temp;
        int i = 0;
        while (i < numArray.length){
            int j = i+1;
            while (j < numArray.length){
                if(numArray[j] > numArray[i]){
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        int result = Integer.parseInt(String.valueOf(numArray));
        return result;
    }
}
