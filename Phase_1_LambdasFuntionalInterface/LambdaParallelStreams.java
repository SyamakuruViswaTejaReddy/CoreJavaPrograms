package Phase_1_LambdasFuntionalInterface;

import java.util.Arrays;
import java.util.List;

public class LambdaParallelStreams {
    public static void main(String[] args) {
        List<Integer> numIntegers = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numIntegers
                   .parallelStream()
                   .filter(n->n%2==0)
                   .map(n->n*n)
                   .sorted()
                   .forEach(System.out::println);
    }
}
