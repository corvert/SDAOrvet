package designPatterns.behavioralPatterns.chainOfResposibility;

public class ExceptionLogger extends AbstractLogger{
    public ExceptionLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Exception Console::Logger: " + message);
    }
}
