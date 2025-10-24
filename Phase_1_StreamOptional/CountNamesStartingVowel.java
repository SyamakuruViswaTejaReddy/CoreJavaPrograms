package Phase_1_StreamOptional;

import java.util.List;

public class CountNamesStartingVowel {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Eve", "Oscar", "Uma", "Charlie");
        long count=names.stream()
                   .filter(n->n.startsWith("A")||n.startsWith("E")||n.startsWith("I")||n.startsWith("O")||n.startsWith("U"))
                   .count();
        System.out.println("Count of names starting with a vowel: " + count);
    }
}
