import java.util.Optional;
public class OptionalClassDemo {
    String s="Hello";
    String getuserName() {
        return s;
    }
    public static void main(String[] args) {
        OptionalClassDemo demo = new OptionalClassDemo(); 
        Optional<String> optional= Optional.of(demo.getuserName());
        Optional<String> optionalname = Optional.ofNullable(demo.getuserName());
        Optional<String> optionalname1 = Optional.empty();
        optionalname.ifPresent(n->System.out.println(n));
    }
}
