import java.util.Arrays;
import java.util.List;

public class ArbitaryInstanceMethodRef {
    public static void main(String[] args) {
        List<String> list =Arrays.asList( "World","Hello");
        list.sort(String::compareToIgnoreCase);
        list.forEach(System.out::println); // Using method reference to print each element
    }
}
