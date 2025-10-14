package Phase_1_LambdasFuntionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaListOps {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>(Arrays.asList("John", "Jane", "Jack", "Doe"));
        //forEach
        names.forEach(System.out::println);
        //removeif
        names.removeIf(s->s.length()==3);
        //replaceAll
        names.replaceAll(s->s.toUpperCase());
        //sort
        names.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(names);
    }
}
