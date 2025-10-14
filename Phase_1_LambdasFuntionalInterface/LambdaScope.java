package Phase_1_LambdasFuntionalInterface;

import java.util.function.Consumer;

public class LambdaScope {
    public static void main(String[] args) {
    String prefix= "Hii"; //Not to modify the variable before it is used in lambda
    // prefix="Hello"; //Effectively final --Error if uncommented
    Consumer<String> consumer=s->{
        System.out.println(prefix+" "+s);
    };
    consumer.accept("world");
    }
}

