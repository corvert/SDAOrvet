package bookJavaFund.calculator;

public class Multiplication extends Operator{
    public Multiplication(){
        super("x");
    }
    @Override
    public double operate(double operand1, double operand2){
        return operand1*operand2;
    }

}
