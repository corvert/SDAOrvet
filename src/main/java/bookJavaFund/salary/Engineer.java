package bookJavaFund.salary;

public class Engineer implements Employee{
    @Override
    public double getNetSalary(){
        return 9000 - getTax();
    }
    public double getTax(){
        return (22 / 100) * 9000;
    }
}
