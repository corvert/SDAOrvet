package advFeatLiveCoding.task02;

@FunctionalInterface
public interface Operator {
    double operand(double n1, double n2);

    static void division(double n1, double n2) throws Exception {
        try {
            System.out.println(n1 / n2);
        } catch (ArithmeticException e) {
            throw new Exception("Can not divide by " + n2);
        }
    }

    static void multiplication(double n1, double n2) {
        System.out.println(n1 * n2);
    }

    static void subtraction(double n1, double n2) {
        System.out.println(n1 - n2);
    }

    static void addition(double n1, double n2) {
        System.out.println(n1 + n2);
    }
}
