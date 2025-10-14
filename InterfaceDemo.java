public interface InterfaceDemo {
    // Method declaration in an interface
    void display();

    // Default method in an interface
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }

    // Static method in an interface
    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }
}
