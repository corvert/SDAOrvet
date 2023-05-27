package codeWars;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class TopWords {
    /*
    Write a function that, given a string of text (possibly with punctuation and line-breaks),
    returns an array of the top-3 most occurring words, in descending order of the number of occurrences.

Assumptions:
A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII.
Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc', ab'c are all valid)
Any other characters (e.g. #, \, / , . ...) are not part of a word and should be treated as whitespace.
Matches should be case-insensitive, and the words in the result should be lowercased.
Ties may be broken arbitrarily.
If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned,
or an empty array if a text contains no words.
     */
    public static void main(String[] args) {
        System.out.println(top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
    }
    public static List<String> top3(String s) {
        final Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z']*");
        final Matcher matcher = pattern.matcher(s.toLowerCase());
        final Map<String, Integer> wordsCount = new HashMap<>();

        while (matcher.find()) {
            String str = matcher.group();
            wordsCount.put(str, wordsCount.getOrDefault(str, 1) + 1);
        }

        return wordsCount.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    public static List<String> top31(String s) {


        return Arrays.stream(s.toLowerCase().split("[^a-z*|']"))
                .filter(o -> !o.isEmpty() && !o.replace("'","").isEmpty())
                .collect(groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .limit(3)
                .collect(Collectors.toList());
    }
}
