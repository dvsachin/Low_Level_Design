package Design_Patterns.C_Behavioural_Patterns.InterpreterPattern.Example_PostfixMathematicalExpression;

public class AdditionExpression implements Expression {
    private Expression firstExpression,secondExpression;
    public AdditionExpression(Expression firstExpression, Expression secondExpression){
        this.firstExpression=firstExpression;
        this.secondExpression=secondExpression;
    }
    @Override
    public int interpret(){
        return this.firstExpression.interpret()+this.secondExpression.interpret();
    }
    @Override
    public String toString(){
        return "+";
    }
}
