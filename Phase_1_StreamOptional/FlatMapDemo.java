package Phase_1_StreamOptional;

import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> names =List.of(
             List.of("A","B","C"),
                List.of("D","E","F")
        );
        names.stream()
             .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
