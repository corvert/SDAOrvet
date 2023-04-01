package bookJavaFund.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StudentsArray extends Student {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Student james = new Student();
        james.setName("James");
        Student mary = new Student();
        james.setName("Mary");
        Student jane = new Student();
        james.setName("Jane");
        Student pete = new Student();
        james.setName("Pete");
        students.add("james");
        students.add("mary");
        students.add("jane");
        students.add("pete");



        Iterator studentIterator = students.iterator();
//        for (String student : students) {
//            System.out.println(students);
//        }
//        while (studentIterator.hasNext()){
//            Student student1 = (Student) studentIterator.next();
//            String name = student1.getName();
//            System.out.println(name);
//        }
//        students.clear();
//        System.out.println(students);

        String saying = "To be or not to be, that is the question";
        int num = saying.length();
        System.out.println(num);
        char c = saying.charAt(7);
        System.out.println(c);
        char[] chars = new char[saying.length()];
        saying.getChars(0, saying.length(), chars,0);
        System.out.println(Arrays.toString(chars));
    }


}
