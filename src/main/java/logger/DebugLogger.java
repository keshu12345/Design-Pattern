package logger;

public class DebugLogger implements Logger{
    Logger nextLogger;

    @Override
    public void setNextLogger(Logger logger) {
        this.nextLogger = logger;
    }
    @Override
    public void logMessage(LogLevel level, String message) {
        if(level==LogLevel.DEBUG){
            System.out.println("DEBUG: "+message);
        }else if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }

    }
}
