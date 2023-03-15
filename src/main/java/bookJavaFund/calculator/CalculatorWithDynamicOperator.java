package bookJavaFund.calculator;

public class CalculatorWithDynamicOperator {
    private final double operand1;
    private final double operand2;
    //
    private final Operator operator;

    public CalculatorWithDynamicOperator(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = Operators.findOperator(operator);
    }
    public double operate(){
        return operator.operate(operand1, operand2);
    }

}
