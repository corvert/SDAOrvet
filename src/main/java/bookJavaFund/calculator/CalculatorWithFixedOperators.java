package bookJavaFund.calculator;

public class CalculatorWithFixedOperators {
    public static void main(String[] args) {


        System.out.println("1+1 = " + new CalculatorWithFixedOperators(1, 1, "+").operate());
        System.out.println("4-2 = " + new CalculatorWithFixedOperators(4, 2, "-").operate());
        System.out.println("1x2 = " + new CalculatorWithFixedOperators(1, 2, "x").operate());
        System.out.println("10/2 = " + new CalculatorWithFixedOperators(10, 2, "/").operate());

        System.out.println("1+1 = " + new CalculatorWithDynamicOperator(1,1,"+").operate());

    }
    private final double operand1;
    private final double operand2;

    private final Operator operator;

    private final Divison divison = new Divison();
    private final Multiplication multiplication = new Multiplication();
    private  final Operator sum = new Operator();
    private final Subtraction subtraction = new Subtraction();

    public CalculatorWithFixedOperators(double operand1, double operand2, String operator){
        this.operand1 = operand1;
        this.operand2 = operand2;

        if (subtraction.matches(operator)){
            this.operator = subtraction;
        } else if (multiplication.matches(operator)){
            this.operator = multiplication;
        } else if (divison.matches(operator)) {
            this.operator = divison;
        } else {
            this.operator = sum;
        }
    }
    public double operate(){
        return operator.operate(operand1, operand2);
    }
}
