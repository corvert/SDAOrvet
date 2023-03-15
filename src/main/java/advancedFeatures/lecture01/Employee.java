package advancedFeatures.lecture01;

public class Employee extends Person{

    private String occupation;
    private int employeeID;

    public Employee(Person person, String occupation, int employeeID){
        super(person);
        this.occupation = occupation;
        this.employeeID = employeeID;
    }

    public Employee(String firstName, String lastName, int age, String occupation, int employeeID) {
        super(firstName, lastName, age);
        this.occupation = occupation;
        this.employeeID = employeeID;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
