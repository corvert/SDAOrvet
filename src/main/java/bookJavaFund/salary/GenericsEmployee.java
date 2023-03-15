package bookJavaFund.salary;

public abstract class GenericsEmployee implements Employee{
  private final double grossSalary;

    public GenericsEmployee(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }
    @Override
    public double getNetSalary(){
        return grossSalary-getTax();
    }

}
