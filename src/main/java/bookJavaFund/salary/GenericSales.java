package bookJavaFund.salary;

public class GenericSales extends GenericsEmployee{
    public GenericSales(double grossSalary) {
        super(grossSalary);
    }
    @Override
    public double getTax(){
        return (19/100)*getGrossSalary();
    }
}
