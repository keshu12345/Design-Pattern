package logger;

public class InfoLogger implements Logger{
    Logger nextLogger;

    @Override
    public void setNextLogger(Logger logger) {
        this.nextLogger = logger;
    }
    @Override
    public void logMessage(LogLevel level, String message) {
        if(level==LogLevel.INFO){
            System.out.println("INFO: "+message);
        }else if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }

    }
}
