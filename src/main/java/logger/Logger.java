package logger;

public interface Logger {
    void setNextLogger(Logger logger);
    void logMessage(LogLevel level,String message);
}
