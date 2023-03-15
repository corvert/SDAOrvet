package bookJavaFund.salary;

public class GenericsManager extends GenericsEmployee{
    public GenericsManager(double grossSalary) {
        super(grossSalary);
    }
    @Override
    public double getTax(){
        return (28/100)*getGrossSalary();
    }
}
