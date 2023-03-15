package advancedFeatures.lecture05.calculatorExercies;


public class CalculatorTest {
    public static void main(String[] args) {

        double fNum = 10;
        double sNum = 5;

        //Implement the arithmetic

        MathOperation addition = (x, y) -> {
            return x + y;
        };
        MathOperation sub = (x, y) -> x - y;
        MathOperation mul = (x, y) -> x * y;
        MathOperation div = (x, y) -> x / y;

        System.out.println(doOperation(4, 2, sub));
    }

    private static double doOperation(double number1, double number2, MathOperation operation) {
        return operation.operate(number1, number2);
    }
}
