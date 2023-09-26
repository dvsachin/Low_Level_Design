package Design_Patterns.C_Behavioural_Patterns.InterpreterPattern.Example_DecodeExpression;

public class InterpreterApplication {

    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john); // any one present in data will return true
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie, married); // both should be present then only it will return true
    }


}