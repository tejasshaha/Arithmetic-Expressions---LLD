public class Main {
    public static void main(String[] args){

        Digit one = new Digit(1);
        Digit three = new Digit(3);
        Digit four = new Digit(4);

        Expression expression1 = new Expression(three,four,Operator.MULTIPLY);
        Expression expreesion2 = new Expression(one,expression1,Operator.ADD);
        System.out.println("Output of expression is :" + expreesion2.evaluate());

    }
}
