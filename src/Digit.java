public class Digit implements ArithmeticExpression{

    int num;
    public Digit(int number){
        this.num=number;
    }

    @Override
    public int evaluate() {
        System.out.println("Number is: " + this.num);
        return this.num;
    }
}
