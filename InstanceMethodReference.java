import java.util.List;

public class InstanceMethodReference {
    public void display(String str) {
        System.out.println("Hello from InstanceMethodReference: " + str);
    }
    public static void main(String[] args) {
        InstanceMethodReference instance = new InstanceMethodReference();
        List<String> list = List.of("Hello", "World");
        list.forEach(instance::display);
    }
}
