package Design_Patterns.C_Behavioural_Patterns.InterpreterPattern.Example_DecodeExpression;

public class Main {
    public static void main(String[] args) {
        Expression isMale = InterpreterApplication.getMaleExpression(); // Robert OR John
        Expression isMarriedWoman = InterpreterApplication.getMarriedWomanExpression(); // Julie AND Married both are present

        System.out.println("John is male? " + isMale.interpret("John has a job"));
        System.out.println("Thomas is researching? " + isMale.interpret("Thomas is researching"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Julie is divorced and married again second time"));
        System.out.println("Mary Jane Watson? " + isMarriedWoman.interpret("M.J loves spider man"));
    }
}
// Interpreter pattern provides a way to evaluate language grammar or expression.
// This type of pattern comes under behavioral pattern.
// This pattern involves implementing an expression interface which tells to interpret a particular context.
// This pattern is used in SQL parsing, symbol processing engine etc.