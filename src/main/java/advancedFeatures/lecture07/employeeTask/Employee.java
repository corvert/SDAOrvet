package advancedFeatures.lecture07.employeeTask;

public class Employee extends Person{
    private String occupation;
    private double salary;
    private int employeeID;

    public Employee(String firstName, String lastName, int age, String occupation, double salary, int employeeID) {
        super(firstName, lastName, age);
        this.occupation = occupation;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                getFirstName() + " " + getLastName()+ " " +
                "occupation='" + occupation + '\'' +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                '}';
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
