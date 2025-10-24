package Phase_1_StreamOptional;

import java.util.List;
import java.util.stream.Collectors;

public class PeekDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> processed=numbers.stream()
               .filter(n->n%2==0)
               .peek(n->System.out.println("is Even:"+n))
               .map(n->n*n)
               .peek(n->System.out.println("Square:"+n))
               .collect(Collectors.toList());
         System.out.println(processed);
    }
}
