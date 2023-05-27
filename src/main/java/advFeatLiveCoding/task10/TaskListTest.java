package advFeatLiveCoding.task10;

import java.util.Scanner;

public class TaskListTest {
    private static Scanner sc = new Scanner(System.in);
    private static TaskList taskList = new TaskList();

    public static void main(String[] args) throws InvalidInputException {


        boolean quit = false;
        printActions();
        int choice;
        while (!quit) {
            System.out.println();
            System.out.println("Enter choice(4-menu)");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Quitting");
                    quit = true;
                    break;
                case 1:
                    addTask();
                    break;
                case 2:
                    taskCompleted();
                    break;
                case 3:
                    taskList.allTasks();
                    break;
                case 4:
                   // taskList.overdueTasks();
                    break;
                default:
                    throw new InvalidInputException("Wrong input");

            }
        }
    }

    private static void addTask() {
        System.out.println("Enter task description");
        String des = sc.next();
        System.out.println("Enter due date");
        int date = sc.nextInt();
        System.out.println("Set priority");
        Priority priority = Priority.valueOf(sc.next());
        System.out.println("Set status");
        boolean status = sc.nextBoolean();
        taskList.allTasks();


    }
    public static void taskCompleted() {

    }








    private static void printActions() {
        System.out.println("\nActions: \npress");
        System.out.println("0 - Quit \n" +
                "1 - Add contact \n" +
                "2 - Set status \n" +
                "3 - View all tasks \n" +
                "4 - View overdue tasks");
        System.out.println("Choose action");
        System.out.println();
    }
}
