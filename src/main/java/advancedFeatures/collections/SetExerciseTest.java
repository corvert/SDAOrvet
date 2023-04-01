package advancedFeatures.collections;

import java.util.*;

public class SetExerciseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> nums = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter a number: ");
            nums.add(scanner.nextInt());
        }
        System.out.println(nums);

        Set<String> words = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a string: ");
            if (!words.add(scanner.next())){
                System.out.println("Duplicate encountered");
            }
        }
        System.out.println(words);

        Set<String> names = new LinkedHashSet<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a name: ");
            names.add(scanner.next());
        }
        System.out.println(names);
    }
}
