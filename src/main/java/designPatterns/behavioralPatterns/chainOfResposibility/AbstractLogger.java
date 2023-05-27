package designPatterns.behavioralPatterns.chainOfResposibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    public static int EXCEPTION = 4;
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

   public void logMessege(int level, String message){
        if (this.level <= level){
            write(message);
        }
        if (nextLogger != null){
            nextLogger.logMessege(level, message);
        }
   }
   abstract protected void write(String message);
}
