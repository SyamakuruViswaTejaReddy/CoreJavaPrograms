package Phase_1_StreamOptional;

import java.util.List;

public class ForEachTerminal {
    public static void main(String[] args) {
     List<String> names= List.of("Rohith","Virat","Dhoni","Rahul","Rishabh");
     names.stream()
          .forEach(System.out::println);   
    }
}
