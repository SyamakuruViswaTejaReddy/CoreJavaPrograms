package Phase_1_LambdasFuntionalInterface;

import java.util.Arrays;
import java.util.List;

public class LambdaWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Using lambda expression to filter even numbers and print them
        System.out.println("Even Numbers:");
        numbers
               .stream()
               .filter(n->n%2==0)
               .forEach(System.out::println);
        //Map each number to its square and print
        System.out.println("Square of Numbers:");
        numbers
                .stream()
                .map(n->n*n)
                .forEach(System.out::println);
        //skip first 2 numbers and print the rest
        System.out.println("After Skipping first 2 Numbers:");
        numbers
                .stream()
                .skip(2)
                .forEach(System.out::println);
        //limit to first 5 numbers and print
        System.out.println("First 5 Numbers:");
        numbers
                .stream()
                .limit(5)
                .forEach(System.out::println);
        //find first element>7
        System.out.println("First Number greater than 7:");
        numbers
                .stream()
                .filter(n->n>7)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
