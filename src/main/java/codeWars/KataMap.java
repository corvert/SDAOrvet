package codeWars;

import java.util.Map;
import java.util.stream.Collectors;

public class KataMap {
    /*
    The main idea is to count all the occurring characters in a string.
    If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
What if the string is empty? Then the result should be empty object literal, {}.
     */
    public static void main(String[] args) {
        System.out.println(count("ab"));
    }

    public static Map<Character, Integer> count(String str) {
        //Map<Character, Integer> charCount = str.codePoints().mapToObj(Character::toString)
        //      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        char[] strArray = str.toCharArray();
//
//        for (char c : strArray) {
//            if (countMap.containsKey(c)) {
//                countMap.put(c, countMap.get(c) + 1);
//            } else {
//                countMap.put(c, 1);
//            }
//        }
//        for (Map.Entry entry : countMap.entrySet()){
//            System.out.print(entry.getKey() + ":" + entry.getValue());
//            //String.format("%s : %s , ", entry.getKey(), entry.getValue());
//        }
//        return str.codePoints().mapToObj(Character::toString)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return str.chars().boxed().collect(Collectors.toMap(k -> (char) k.intValue(), v -> 1, Integer::sum));
    }
}

