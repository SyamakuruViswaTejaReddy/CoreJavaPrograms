package Phase_1_StreamOptional;

import java.util.List;

public class MapToIntDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum= numbers.stream()
                        .mapToInt(Integer::intValue) // Convert Integer to int
                        .sum();
        System.out.println("Sum: " + sum);
    }
}
