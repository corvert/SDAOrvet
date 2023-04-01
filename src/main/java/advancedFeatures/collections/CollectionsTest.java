package advancedFeatures.collections;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        //SET

//        //HashSet hashSet = new HashSet();
//        Set<String> names = new HashSet<>();
//        names.add("Bobby");
//        names.add("Dave");
//        names.add("Barry");
//        names.add("Larry");
//
//        Object[] theNames = names.toArray();
//        System.out.println(names.size());
//        System.out.println(names);
//
//        System.out.println(Arrays.toString(theNames));
//
//        for (String look : names) {
//            System.out.println(look);
//        }
//
//        Set<Integer> numbers = new TreeSet<>();
//        numbers.add(4);
//        numbers.add(2);
//        numbers.add(1);
//
//        System.out.println(numbers);
//
        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(4);
        nums.add(2);
        nums.add(5);
        nums.add(1);
        nums.remove(4);
        System.out.println(nums);

//
//        List<String> name = new ArrayList<>();
//        name.add("Harry");
//        name.add("Lisa");
//        name.add("Lisa");
//        name.add("Rebecca");
//
//        System.out.println(name);

        //Quene
        //FIFO

//        Queue<String> starbucksQuene = new LinkedList<>();

//        throw  exceptions
//                add (E e)
//                remove (E e)
//                element (E e)

        //

//        starbucksQuene.add("David");
//        starbucksQuene.offer("Barry");
//        starbucksQuene.offer("Johnson");
//
//        System.out.println(starbucksQuene.peek());
////        starbucksQuene.poll();
//
////        starbucksQuene.remove();
//
//        System.out.println(starbucksQuene);

        //Map

        Map<String, Integer> peopleAges = new LinkedHashMap<>();
        peopleAges.put("David", 14);
       // peopleAges.put("Barry", 15);
        peopleAges.put("Johnson", 16);

        peopleAges.putIfAbsent("Barry", 18);

        peopleAges.remove("Barry");

        System.out.println(peopleAges.size());
        System.out.println(peopleAges.containsKey("Fred"));
        System.out.println(peopleAges.containsValue(16));
        System.out.println(peopleAges.keySet());

        System.out.println(peopleAges);

    }
}
