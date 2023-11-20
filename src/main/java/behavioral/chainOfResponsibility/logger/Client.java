package behavioral.chainOfResponsibility.logger;

public class Client {
    public static void main(String[] args) {
        // Creating the chain of responsibility
        Logger errorLogger = new ErrorLogger();
        Logger warnLogger = new WarnLogger();
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();

        errorLogger.setNextLogger(warnLogger);
        warnLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);

        // Logging messages with different log levels
        errorLogger.logMessage(LogLevel.ERROR, "An error occurred.");
        errorLogger.logMessage(LogLevel.DEBUG, "Debugging information.");
        errorLogger.logMessage(LogLevel.INFO, "Information message.");
        errorLogger.logMessage(LogLevel.WARN, "Warning message.");

    }
}
