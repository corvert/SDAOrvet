package bookJavaFund.salary;

public class GenericsEngineer extends GenericsEmployee{
    public GenericsEngineer(double grossSalary) {
        super(grossSalary);
    }
    @Override
    public double getTax(){
        return (22/100) * getGrossSalary();
    }
}
