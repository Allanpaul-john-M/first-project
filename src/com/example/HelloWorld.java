package antproject;

import antproject.AddTwoNumber;
import antproject.MultipleNumber;
import antproject.MathOperator;

public class HelloWorld {
    private static final Integer A = 10;
    private static final Integer B = 20;
    public static void main(String[] args) {
        System.out.println("Ant Project!!!");
        AddTwoNumber.getNumber();
        MultipleNumber.getMultipleNumber(A, B);
        MathOperator.add(A,B);
    }
}
