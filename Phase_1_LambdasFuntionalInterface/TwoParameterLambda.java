package Phase_1_LambdasFuntionalInterface;

public class TwoParameterLambda {
    public static void main(String[] args) {
        
    Maths addition=(a,b)-> a+b;
    Maths subtraction=(a,b)-> a-b;
    Maths multiplication=(a,b)-> a*b;
    Maths division=(a,b)-> a/b;
    
    System.out.println("Addition: "+addition.operation(10,5));
    System.out.println("Subtraction: "+subtraction.operation(10,5));
    System.out.println("Multiplication: "+multiplication.operation(10,5));
    System.out.println("Division: "+division.operation(10,5));
    }
}
