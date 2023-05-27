package codeWars;

public class DRoot {
    /*
    Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n.
If that value has more than one digit, continue reducing in this way until a single-digit number is produced.
The input will be a non-negative integer.
     */

    public static void main(String[] args) {
        System.out.println(digital_root(12));
    }
    public static int digital_root(int n) {
        int sum = 0;
       do {

           char[] numbs = String.valueOf(n).toCharArray();
           for (int i : numbs) {
               sum += numbs[i];
           }
       } while (sum > 10);

return sum;
    }
}
