package designPatterns.behavioralPatterns.chainOfResposibility;

public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger exceptionLogger = new ExceptionLogger(AbstractLogger.EXCEPTION);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(exceptionLogger);
        exceptionLogger.setNextLogger(null);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessege(AbstractLogger.INFO,
                "This is an information");
    }
}
