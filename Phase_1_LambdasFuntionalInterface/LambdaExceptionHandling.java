package Phase_1_LambdasFuntionalInterface;

import java.util.function.Consumer;

public class LambdaExceptionHandling {
    public static void main(String[] args) {
        Consumer<Integer> consumer=n->{
            try{
                System.out.println(100/n);
            }
            catch(ArithmeticException e){
                System.out.println("Exception: "+e.getMessage());
            }
        };
        System.out.println("Testing Exception Handling in Lambda:");
        System.out.println("Dividing 100 by 10:");
        consumer.accept(10);
        System.out.println("Dividing 100 by 0:");
        consumer.accept(0);
    }
}
