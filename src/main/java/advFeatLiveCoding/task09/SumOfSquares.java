package advFeatLiveCoding.task09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
    public static void main(String[] args) {

        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum1 = arrayList.stream().mapToInt(integer -> (int) Math.pow(integer, 2)).sum();
        System.out.println(sum1);
        int total = arrayList.stream().mapToInt(n -> n * n).reduce(0, Integer::sum);
        System.out.println(total);


    }

}
