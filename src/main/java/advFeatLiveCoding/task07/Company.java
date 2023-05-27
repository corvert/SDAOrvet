package advFeatLiveCoding.task07;

import java.util.*;

public class Company {
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }
    
    public void addEmpolyees(Employee... employees){
        this.employees.addAll(Arrays.asList(employees));
    }
    public double getAverageSalary(){
        double sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            sum += employees.get(i).getSalary();
        }
        return sum/employees.size();
    }
    public double getOldestEmployee() {
        int oldest = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (oldest < employees.get(i).getAge()) {
                oldest = employees.get(i).getAge();
            }
        }
        return oldest;
    }
    public Employee getRandomEmployee(){
        int index = 0;
        for (int i = 0; i < employees.size(); i++) {
            index = (int) (Math.random() * employees.size());
        }
        System.out.print("Night shift will make ");
        return employees.get(index);
    }
}
