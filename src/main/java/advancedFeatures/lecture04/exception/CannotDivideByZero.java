package advancedFeatures.lecture04.exception;

public class CannotDivideByZero extends  RuntimeException{
    public CannotDivideByZero(String message, Throwable cause) {
        super(message, cause);
    }
}
