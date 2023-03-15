package bookJavaFund.salary;

import java.util.Random;

public class EmployeeLoader {
    private static Random random = new Random(15);

    public static Employee getEmployee(){
        int nextNumber = random.nextInt(4);
        switch (nextNumber){
            case 0:
                // A sales person with total sales between 5000 and 1550000
                double grossSales = random.nextDouble() * 150000 + 5000;
                return new SalesWithCommission(grossSales);
            case 1:
                return new Manager();
            case 2:
                return new Engineer();
            case 3:
                return new Sales();
            default:
                return new Manager();
        }
    }
    public static Employee getEmployeeWithSalary(){
        int nextNumber = random.nextInt(4);
        //Random salary between 70000 and 70000+50000
        double grossSalary = random.nextDouble() * 50000+70000;
        switch (nextNumber){
            case 0:
                // A sales person with total sales between 5000 and 155000
                double grossSales = random.nextDouble()* 150000+5000;
                return new GenericsSalesWithCommission(grossSalary, grossSales);
            case 1:
                return new GenericsManager(grossSalary);
            case 2:
                return new GenericsEngineer(grossSalary);
            case 3:
                return new GenericSales(grossSalary);
            default:
                return new GenericsManager(grossSalary);
        }
    }
}
