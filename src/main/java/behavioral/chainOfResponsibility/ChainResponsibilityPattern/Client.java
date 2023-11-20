package behavioral.chainOfResponsibility.ChainResponsibilityPattern;

public class Client {

    public static void main(String[]args){
        LogProcessor logObject=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.INFO,"just for info");
        logObject.log(LogProcessor.DEBUG,"need to debug it");
        logObject.log(LogProcessor.ERROR,"exception happens");

    }
}
