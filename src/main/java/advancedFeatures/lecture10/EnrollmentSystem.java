package advancedFeatures.lecture10;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class EnrollmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> students = new LinkedHashSet<>();
        Set<Course> courses = new LinkedHashSet<>();
        boolean quit = false;
        printActions();
        int choice;
        while (!quit) {
            System.out.println();
            System.out.println("Enter choice(6-menu)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter student ID");
                    int id = scanner.nextInt();
                    System.out.println("Enter student name");
                    String name = scanner.next();
                    System.out.println("Enter student major");
                    String major = scanner.next();
                    Student student = new Student(id, name, major);
                    students.add(student);
                    System.out.println(students.toString());
                    break;
                case 2:
                    System.out.println("Enter course name");
                    String courseName = scanner.next();
                    System.out.println("Enter course code");
                    String courseCode = scanner.next();
                    System.out.println("Enter course teacher");
                    String courseTeacher = scanner.next();
                    Course course = new Course(courseName, courseCode, courseTeacher);
                    courses.add(course);
                    System.out.println(courses.toString());
                    break;
                case 3:
                    System.out.println("Enter student to remove");
                    int removeName = scanner.nextInt();

                            students.remove(removeName);

                    System.out.println(students.toString());
                    break;
                case 4:
                    System.out.println("Enter course to remove");
                    String removeCourse = scanner.next();

                        courses.remove(removeCourse);

                    System.out.println(courses.toString());
                    break;
                case 5:
                    System.out.println("Enter student");
                    String nameToCourse = scanner.next();
                    System.out.println("Enter course");
                    String courseRoll = scanner.next();


                    break;
                case 6:
                    printActions();
                    break;
                default:
                    System.out.println("Wrong choice");
                    printActions();
            }
        }
    }



    public static void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID");
        int id = sc.nextInt();
        System.out.println("Enter student name");
        String name = sc.next();
        System.out.println("Enter student major");
        String major = sc.next();
        Student student = new Student(id, name, major);

    }
    public static void addCourse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course name");
        String courseName = scanner.next();
        System.out.println("Enter course code");
        String courseCode = scanner.next();
        System.out.println("Enter course teacher");
        String courseTeacher = scanner.next();
        Course course = new Course(courseName, courseCode, courseTeacher);

    }
    public static void removeStudent(){

    }
    public static void removeCourse(){

    }
    public static void enrollStudentToCourse(){

    }
    private static void printActions() {
        System.out.println("\nActions: \npress");
        System.out.println("0 - Quit \n" +
                "1 - Add student \n" +
                "2 - Add course \n" +
                "3 - Remove student \n" +
                "4 - Remove course \n" +
                "5 - Enroll student to course \n" +
                "6 - Print actions");
        System.out.println("Choose action");
        System.out.println();
    }
}
