package designPatterns.composite;

public class EmployeeDemo {
    public static void main(String[] args) {


        Employee manager = new Employee("manager", "Software", 100);
        System.out.println("manager without delevoper" + manager);

        Employee developer1 = new Employee("developer1", "Software", 80);
        manager.add(developer1);

        System.out.println("manager with 1 delevoper" + manager);

        Employee developer2 = new Employee("developer2", "Software", 80);
        manager.add(developer2);

        System.out.println("manager with 2 delevoper" + manager);

        Employee employee1 = new Employee("Account1", "acc", 23);
        developer2.add(employee1);

        Employee employee2 = new Employee("Account2", "acc", 23);
        developer2.add(employee2);

        System.out.println("Developer2 with 2 employees " + developer2);

    }
}
