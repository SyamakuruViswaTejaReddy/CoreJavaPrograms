package Phase_1_StreamOptional;

import java.util.List;

public class FindFirstAnyMatchDemo {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack", "Jane","JOHN", "JANE DOE");
        boolean b=names.stream()
             .anyMatch(name -> name.equals("Jane")); // true
        String name=names.stream()
                         .filter(n->n.equals("Jane"))
                         .findFirst().get();
        System.out.println("is found?:"+b+"findfirst:"+name);
    }
}
