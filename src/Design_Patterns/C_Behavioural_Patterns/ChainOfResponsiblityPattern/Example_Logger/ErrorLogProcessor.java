package Design_Patterns.C_Behavioural_Patterns.ChainOfResponsiblityPattern.Example_Logger;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message) {
        if(logLevel == ERROR) System.out.println("ERROR : "+message);
        else super.log(logLevel,message);
    }
}
