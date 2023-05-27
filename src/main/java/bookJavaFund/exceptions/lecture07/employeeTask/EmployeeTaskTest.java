package bookJavaFund.exceptions.lecture07.employeeTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTaskTest {
    public static void main(String[] args) {
        Employee jack = new Employee("Jack", "Barrow",33,"Pirate",2000,123);
        Employee john = new Employee("John", "Wick", 40, "Loser", 3000, 321);


        Company movie = new Company("Movie");
        List<Employee> employees = new ArrayList<>();
        movie.employeeList.add(jack);
        movie.employeeList.add(john);
        System.out.println(movie.averageSalary());
        movie.averageSalary();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        String scName = scanner.next();
        System.out.println("Enter employee last name");
        String scLastName = scanner.next();
        System.out.println("Enter employee age");
        int scAge = scanner.nextInt();
        System.out.println("Enter occupation");
        String scOccupation = scanner.next();
        System.out.println("Enter salary");
        double scSalary = scanner.nextDouble();
        System.out.println("Enter employee ID");
        int scId = scanner.nextInt();
        employees.add(new Employee(scName, scLastName, scAge, scOccupation, scSalary, scId));


        System.out.println(movie.employeeList);
        System.out.println("Average salary is " + movie.averageSalary());

    }
}
