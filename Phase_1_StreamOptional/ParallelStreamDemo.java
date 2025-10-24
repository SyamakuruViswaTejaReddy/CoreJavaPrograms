package Phase_1_StreamOptional;

import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List.of("A", "B", "C", "D", "E", "F").parallelStream().forEach(e -> {
            System.out.println(e + " : " + Thread.currentThread().getName());
        });
    }
}
