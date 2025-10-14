public class ConstructorOverloading {
    // Default constructor
    public ConstructorOverloading() {
        System.out.println("Default constructor called");
    }

    // Parametrized constructor
    public ConstructorOverloading(String message) {
        System.out.println("Parametrized constructor called with message: " + message);
    }
    // Overloaded constructor with two parameters
    public ConstructorOverloading(String message, int number) {
        System.out.println("Overloaded constructor called with message: " + message + " and number: " + number);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        ConstructorOverloading defaultObj = new ConstructorOverloading();
        ConstructorOverloading paramObj = new ConstructorOverloading("Hello, World!");
        ConstructorOverloading overloadedObj = new ConstructorOverloading("Hello, World!", 42);
    }
}
