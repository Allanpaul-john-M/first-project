package antproject;

public class MathOperator{

    public static void main(String[] args){
        add(10, 20);
        sub(20, 10); 
        mul(10, 5);  
        div(20, 4); 
    }

    public static void add(int A, int B){
        int C = A + B;
        System.out.printf("%d%n", C);
    }
    public static void sub(int A, int B){
        int C = A - B;
        System.out.printf("%d%n",C);
    }

    public static void mul(int A, int B){
        int C = A * B;
        System.out.printf("%d%n",C);
    }

    public static void div(int A, int B){
        int C = A / B;
        System.out.printf("%d%n",C);
    }
}