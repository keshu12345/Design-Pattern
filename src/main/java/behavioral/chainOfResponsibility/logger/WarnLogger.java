package behavioral.chainOfResponsibility.logger;

public class WarnLogger implements Logger{
    Logger nextLogger;

    @Override
    public void setNextLogger(Logger logger) {
        this.nextLogger = logger;
    }
    @Override
    public void logMessage(LogLevel level, String message) {
        if(level==LogLevel.WARN){
            System.out.println("WARN: "+message);
        }else if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }

    }
}
