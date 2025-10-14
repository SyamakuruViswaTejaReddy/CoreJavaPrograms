package Phase_1_LambdasFuntionalInterface;

import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack", "Alice", "Bob");
        //Custom Comparator using Lambda to sort by length of names
        System.out.println("Names sorted by length:");
        names.sort((s1,s2)->s1.length()-s2.length());
        // Print sorted names
        names.forEach(System.out::println);
        //Custom Comparator using Lambda to sort alphabetically
        System.out.println("Names sorted alphabetically:");
        names.sort((s1,s2)->s1.compareTo(s2));
        // Print sorted names
        names.forEach(System.out::println);
    }
}
