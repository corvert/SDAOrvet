package codeWars;

public class DivisibleNb {
    public static void main(String[] args) {
        System.out.println(isDivisible(100,1,3));
    }
    public static boolean isDivisible(long n, long x, long y) {
        return ((n % x == 0) && (n % y ==0));
    }
}
