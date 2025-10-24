package Phase_1_StreamOptional;

import java.util.List;
import java.util.stream.Collectors;

public class CountSkipDemo {
    public static void main(String[] args) {
        List<String> names = List.of("John", "dJane", "Jack", "Jane","JOHN", "JANE DOE");
        List<String> namesList=names.stream()
                                    .filter(s->s.startsWith("J"))
                                    .skip(2)
                                  //  .count()
                                    .collect(Collectors.toList());
        System.out.println(namesList);
    }
}
