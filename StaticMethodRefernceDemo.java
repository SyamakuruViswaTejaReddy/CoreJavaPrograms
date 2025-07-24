import java.util.Arrays;
import java.util.List;

public class StaticMethodRefernceDemo {
    public static void display(String str) {
        System.out.println("Hello from StaticMethodRefernceDemo"+": " + str);
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World");
        list.forEach(StaticMethodRefernceDemo::display); // Calling the static method directly
    }
}
