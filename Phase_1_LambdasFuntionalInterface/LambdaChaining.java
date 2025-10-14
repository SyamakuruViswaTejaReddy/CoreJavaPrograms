package Phase_1_LambdasFuntionalInterface;

import java.util.function.Function;

public class LambdaChaining {
    public static void main(String[] args) {
        Function<String, String> trim=String::trim;
        Function<String, String> upper=String::toUpperCase;
        Function<String, String> combined=trim.andThen(upper);
        System.out.println(combined.apply("   hello world   "));
    }
}
