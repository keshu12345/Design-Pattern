package behavioral.chainOfResponsibility.logger;

public class ErrorLogger implements Logger{
    Logger nextLogger;

    @Override
    public void setNextLogger(Logger logger) {
        this.nextLogger = logger;
    }
    @Override
    public void logMessage(LogLevel level, String message) {
        if(level==LogLevel.ERROR){
            System.out.println("ERROR: "+message);
        }else if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }

    }
}
