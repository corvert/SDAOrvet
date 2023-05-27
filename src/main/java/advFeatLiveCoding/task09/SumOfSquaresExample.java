package advFeatLiveCoding.task09;

import java.util.stream.IntStream;

public class SumOfSquaresExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10)
                .map(x -> x*x)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares of 1-10: " + sum);
    }
}
