public class Expression implements ArithmeticExpression{

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operator operator;

    public Expression(ArithmeticExpression left,ArithmeticExpression right,Operator op){
        this.leftExpression=left;
        this.rightExpression=right;
        this.operator=op;
    }

    @Override
    public int evaluate() {
        int value=0;
        switch (operator){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;

            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;

            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;

            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
        }

        return value;
    }
}
