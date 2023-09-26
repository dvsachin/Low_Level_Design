package Design_Patterns.C_Behavioural_Patterns.InterpreterPattern.Example_PostfixMathematicalExpression;


import org.testng.annotations.Test;

public class ExpressionParserTest {
    @Test
    public void testParse() throws Exception {
        String input="2 1 5 + *";
        ExpressionParser expressionParser=new ExpressionParser();
        int result=expressionParser.parse(input);
        System.out.println("Final result: "+result);
    }
}

