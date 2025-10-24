package Phase_1_StreamOptional;

import java.util.List;

public class DistinctSortedLimit {
    public static void main(String[] args) {
    List<Integer> numbers = List.of(1,2,3,4,2,3,4,5,6,7,8,5,6,7,8,9,10);
    numbers.stream()
           .distinct()
           .sorted()
           .limit(5)
           .forEach(System.out::println);     
    }
}
