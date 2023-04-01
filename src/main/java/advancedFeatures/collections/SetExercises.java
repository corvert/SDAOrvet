package advancedFeatures.collections;

import java.util.*;

public class SetExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int textCount = 0;

        Set<Integer> numbersSet = new TreeSet<>();
        Set<String> textSet = new HashSet<>();
        Set<String> nameSet = new LinkedHashSet<>();


        while (numbersSet.size() < 6) {
            System.out.println("Enter number #" + (numbersSet.size() + 1));
            int n = sc.nextInt();
            numbersSet.add(n);
        }
        System.out.println(numbersSet);



        while (textCount < 5) {
            System.out.println("Enter text #" + (textCount + 1));

            String text = sc.nextLine();
            textSet.add(text);
            textCount++;
        }
        System.out.println(textSet);
        System.out.println();

        while (nameSet.size() < 4) {
            System.out.println("Enter name # " + (nameSet.size() + 1));
            String name = sc.nextLine();
            nameSet.add(name);
        }
        System.out.println(nameSet);
    }
}
