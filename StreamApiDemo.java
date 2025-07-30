import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        // Example of using Stream API to filter and print even numbers from a list
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println); // Using method reference to print each even number
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        names.stream()
            .filter(str ->str.length()>3)
            .forEach(System.out::println);   
            
        // Example of using Stream API to find the maximum number in a list
        int maxNumber = numbers.stream()
                               .max(Integer::compareTo)
                               .orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("Maximum number: " + maxNumber);
        // Example of using Stream API to calculate the sum of numbers in a list
        int sum = numbers.stream()
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println("Sum of numbers: " + sum);
        // Example of using Stream API to collect names into a new list
        List<String> longNames = names.stream()
                                      .filter(name -> name.length() > 3)
                                      .collect(Collectors.toList());
        System.out.println("Names with more than 3 characters: " + longNames);
        // Example of using Stream API to convert names to uppercase
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Uppercase names: " + upperCaseNames);
        // Example of using Stream API to sort names alphabetically
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);
        // Example of using Stream API to check if any name starts with 'A'
        boolean anyStartsWithA = names.stream()
                                      .anyMatch(name -> name.startsWith("A"));
        System.out.println("Any name starts with 'A': " + anyStartsWithA);
        // Example of using Stream API to count names with more than 3 characters
        long countLongNames = names.stream()
                                   .filter(name -> name.length() > 3)
                                   .count();
        System.out.println("Count of names with more than 3 characters: " + countLongNames);
        // Example of using Stream API to find the first name that starts with 'C'
        String firstNameStartingWithC = names.stream()
                                             .filter(name -> name.startsWith("C"))
                                             .findFirst()
                                             .orElse("No name starts with 'C'");
        System.out.println("First name starting with 'C': " + firstNameStartingWithC);
        // Example of using Stream API to create a comma-separated string of names
        String commaSeparatedNames = names.stream()
                                          .collect(Collectors.joining(", "));
        System.out.println("Comma-separated names: " + commaSeparatedNames);
        // Example of using Stream API to create a list of lengths of each name
        List<Integer> nameLengths = names.stream()
                                         .map(String::length)
                                         .collect(Collectors.toList());
        System.out.println("Lengths of names: " + nameLengths);
        // Example of using Stream API to filter names that contain the letter 'a'
        List<String> namesContainingA = names.stream()
                                             .filter(name -> name.toLowerCase().contains("a"))
                                             .collect(Collectors.toList());
        System.out.println("Names containing 'a': " + namesContainingA);
        // Example of using Stream API to find the shortest name
        String shortestName = names.stream()
                                   .min((name1, name2) -> Integer.compare(name1.length(), name2.length()))
                                   .orElse("No names available");
        System.out.println("Shortest name: " + shortestName);
    }
}
