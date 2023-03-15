package bookJavaFund.calculator;

public class Divison extends Operator {
    public Divison() {
        super("/");
    }

    public double operate(double operand1, double operand2) {
        return operand1 / operand2;
    }
}
