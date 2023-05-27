package codeWars;

public class SolutionRepeatStr {
    /*
    Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

Examples (input -> output)
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"
     */
    public static void main(String[] args) {
        System.out.println(repeatStr(5, "Hello"));
    }
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }
    static String repeatStr1(int repeat, String string) {
        return string.repeat(repeat);
    }
}
