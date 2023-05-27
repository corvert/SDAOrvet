package bookJavaFund.exceptions.lecture07.employeeTask;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    List<Employee> employeeList;


    public Company(String companyName) {
        this.companyName = companyName;
        this.employeeList = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }

    public double averageSalary() {
        double sum = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            sum += employeeList.get(i).getSalary();
        }
        return sum / employeeList.size();
    }
}
