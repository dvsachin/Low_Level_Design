package Design_Patterns.C_Behavioural_Patterns.ChainOfResponsiblityPattern.Example_Logger;

public class Client {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
       // first request go to -> InfoLogProcessor -> DebugLogProcessor -> ErrorLogProcessor
        logObject.log(LogProcessor.ERROR, "exceptions happens"); // loglevel at last at ErrorLogProcessor
        logObject.log(LogProcessor.DEBUG, "Need to debug this");
        logObject.log(LogProcessor.INFO, "Just for info");

        // loglevel at last at concrete Handler else it will call next Handler in the chain
    }
}
