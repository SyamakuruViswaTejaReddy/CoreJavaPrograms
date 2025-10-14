package Phase_1_LambdasFuntionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaBuiltInFuncInterfaces {
    public static void main(String[] args) {
        //Predicate
        Predicate <Integer> pr = a -> a%2 == 0;
        System.out.println(pr.test(10));
        //Function
        Function<String,Integer> s= str->str.length();
        System.out.println(s.apply("Hello"));
        //Consumer
        Consumer<String> con = name->System.out.println("Hello "+name);
        con.accept("John");
        //Supplier
        Supplier <Double> randomSupplier =()->Math.random();
        System.out.println(randomSupplier.get());
    }
}
