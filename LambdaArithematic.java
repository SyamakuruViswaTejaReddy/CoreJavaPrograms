public class LambdaArithematic {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Arithematic interface
        Arithematic ad = (a, b) -> a + b;
        System.out.println("Sum: " + ad.art(5, 3));
        Arithematic sub = (a,b) ->a-b;
        System.out.println("Subtraction: " + sub.art(5, 3));
        Arithematic mul = (a,b) -> a*b;
        System.out.println("Multiplication: " + mul.art(5, 3));
        Arithematic div = (a,b) -> a/b;
        System.out.println("Division: " + div.art(6, 3));
        Arithematic mod = (a,b) -> a%b;
        System.out.println("Modulus: " + mod.art(5, 3));
        Arithematic max =(a,b)-> a>b? 1: -1;
        System.out.println(max.art(5,3)>0 ? "5 is max" : "3 is max"); 
    }
    
 }
