public class InterfaceDemoExt implements InterfaceDemo {
    // Implementing the display method from the interface
    @Override
    public void display() {
        System.out.println("Display method implemented in InterfaceDemoExt.");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        InterfaceDemo demo = new InterfaceDemoExt();
        demo.display(); // Calls the display method
        demo.defaultMethod(); // Calls the default method from the interface
        InterfaceDemo.staticMethod(); // Calls the static method from the interface
    }
    
}
