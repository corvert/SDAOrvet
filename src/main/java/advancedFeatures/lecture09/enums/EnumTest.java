package advancedFeatures.lecture09.enums;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EnumTest {
    public static void main(String[] args) {
//        System.out.println(Sandwich.PI.getPiValue());
//        System.out.println(FoodMenu.DINNER.getDessert());
//        System.out.println(FoodMenu.LUNCH);
//        System.out.println(FoodMenu.BREAKFAST.name());

        Stream.of(FoodMenu.values()).forEach(value -> System.out.println(value));
        Stream.of(FoodMenu.values()).forEach(System.out::println);
        Stream.of(FoodMenu.values()).collect(Collectors.toList());
    }
}
