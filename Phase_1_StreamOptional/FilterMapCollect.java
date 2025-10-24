package Phase_1_StreamOptional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapCollect {
 public static void main(String[] args) {
    List<String> names= Arrays.asList("Rohith","Virat","Dhoni","Rahul","Rishabh");
   List<String> Batsman= names.stream()
                              .filter(n->n.startsWith("V"))
                              .map(String::toUpperCase)
                              .collect(Collectors.toList());
    System.out.println(Batsman);
 }   
}