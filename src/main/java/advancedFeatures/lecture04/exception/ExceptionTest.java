package advancedFeatures.lecture04.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            accessArray(3);

            float val = divide(4,0);

            System.out.println(val);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public static void accessArray(int index){
        int[] nums = new int [5];

        if (index >= nums.length){
            throw new ArrayIndexOutOfBoundsException("No such index " + index);
        }
        int val = nums[index];
        System.out.println(val);
    }

    public static float divide(float dividend, float divisor){
        if (divisor == 0){
            String message = "Cannot divide " + dividend + " 0";
            Throwable cause = new ArithmeticException("Division by zero");
            throw new CannotDivideByZero(message, cause);
        }
        return dividend / divisor;
    }
}
