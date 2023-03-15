package bookJavaFund.salary;

public class GenericsSalesWithCommission extends GenericsEmployee{
    private final double grossSales;

    public GenericsSalesWithCommission(double grossSalary, double grossSales) {
        super(grossSalary);
        this.grossSales = grossSales;
    }

    public double getCommission() {
        return grossSales * 0.15;
    }

    @Override
    public double getTax(){
        return (19/100)* getGrossSalary();
    }
}
