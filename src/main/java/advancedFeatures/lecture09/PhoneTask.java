package advancedFeatures.lecture09;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class PhoneTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> phoneBook = new TreeMap<>();
        boolean quit = false;
        printActions();
        int choice;
        while (!quit) {
            System.out.println();
            System.out.println("Enter choice(4-menu)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 1:
                    //addContact();
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter phone number");
                    int phoneNumber = scanner.nextInt();
                    if (phoneBook.containsKey(name)){
                        System.out.println(name + " is already in phonebook");
                    } else {
                        phoneBook.put(name, phoneNumber);
                    }
                    break;
                case 2:
                    //findContact();
                    System.out.println("Enter contact You like to found");
                    String findName = scanner.next();
                    for (String names : phoneBook.keySet()) {
                        if (names.equals(findName))
                            System.out.println(names + " number is " + phoneBook.get(names));

                    }
                    break;
                case 3:
                    //allContacts();
                    for (String allNames : phoneBook.keySet()) {
                        System.out.println(allNames + " phone number is " + phoneBook.get(allNames));
                    }
                    break;
                case 4:
                    printActions();
                    break;
                default:
                    System.out.println("Wrong choice");
                    printActions();
            }
        }
    }

//    public static Map<String, Integer> addContact() {
//        Scanner sc = new Scanner(System.in);
//        //Map<String, Integer> phoneBook = new LinkedHashMap<>();
//        System.out.println("Enter name");
//        String name = sc.next();
//        System.out.println("Enter phone number");
//        int phoneNumber = sc.nextInt();
//        phoneBook.putIfAbsent(name, phoneNumber);
//        return phoneBook;
//    }

//    public static void findContact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter contact You like to found");
//        String findName = scanner.next();
//        Map<String, Integer> phoneBook = addContact();
//        for (String names : phoneBook.keySet()) {
//            if (names.equals(findName)) {
//                System.out.println(phoneBook.get(names));
//            }
//        }
//    }
//
//    public static void allContacts() {
//        Map<String, Integer> names = addContact();
//        for (String allNames : names.keySet()) {
//            System.out.println(allNames + " phone number is " + names.get(allNames));
//        }
//    }

    private static void printActions() {
        System.out.println("\nActions: \npress");
        System.out.println("0 - Quit \n" +
                "1 - Add contact \n" +
                "2 - Find contact by name \n" +
                "3 - Print all contacts \n" +
                "4 - Show actions");
        System.out.println("Choose action");
        System.out.println();
    }
}

