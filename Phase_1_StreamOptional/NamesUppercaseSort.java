package Phase_1_StreamOptional;

import java.util.ArrayList;
import java.util.List;

public class NamesUppercaseSort {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Rohith");
        list.add("Gill");
        list.add("Kohli");
        list.add("Shreyas");
        list.add("Rahul");
        list.stream()
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }
}
