public class ParametrizedConstructor {
    // Parametrized constructor
    public ParametrizedConstructor(String message) {
        System.out.println("Parametrized constructor called with message: " + message);
    }

    // Main method to test the parametrized constructor
    public static void main(String[] args) {
        ParametrizedConstructor obj = new ParametrizedConstructor("Hello, World!");
    }
}
