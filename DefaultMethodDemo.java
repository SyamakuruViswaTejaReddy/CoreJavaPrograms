
public class DefaultMethodDemo implements InterfaceDefault {
    @Override
    public void display() {
        System.out.println("Display method in DefaultMethodDemo");
    }
    @Override  //optional, but good practice to indicate overriding
    public void defaultMethod(){
        System.out.println("Overridden default method in DefaultMethodDemo");
    }
    public static void main(String[] args) {
        DefaultMethodDemo demo = new DefaultMethodDemo();
        demo.display(); // Calls the overridden display method
        demo.defaultMethod(); // Calls the default method from the interface
        InterfaceDefault.staticMethod(); // Calls the static method from the interface
    }
    
}
