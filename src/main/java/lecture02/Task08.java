package lecture02;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float numbOne = sc.nextFloat();
        char mathSymbol = sc.next().charAt(0);
        float numbTwo = sc.nextFloat();

        String expression = numbOne + " " + mathSymbol + " " + numbTwo + " = ";
        if (mathSymbol == '+') {
            System.out.println(expression + (numbOne + numbTwo));
        } else if (mathSymbol == '-') {
            System.out.println(expression + (numbOne - numbTwo));
        } else if (mathSymbol == '*') {
            System.out.println(expression + (numbOne * numbTwo));
        } else if (mathSymbol == '/') {
            if (numbTwo == 0) {
                System.out.println("Cannot calculate");
            } else
                System.out.println(expression + (numbOne / numbTwo));
        } else {
            System.out.println("Invalid symbol");
        }
    }
}
