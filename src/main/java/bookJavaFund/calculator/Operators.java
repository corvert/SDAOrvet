package bookJavaFund.calculator;

public class Operators {
    public static final Operator DEFAULT_OPERATOR = new Operator();
    public static final Operator[] OPERATORS = {
            new Divison(),
            new Multiplication(),
            DEFAULT_OPERATOR,
            new Subtraction(),
    };
    public static Operator findOperator(String operator){
        for (Operator possible : OPERATORS){
            if (possible.matches(operator)){
                return possible;
            }
        }
        return DEFAULT_OPERATOR;
    }

}
