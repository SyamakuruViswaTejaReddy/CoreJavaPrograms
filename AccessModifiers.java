public class AccessModifiers {
    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method: Accessible from anywhere.");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("Private Method: Accessible only within this class.");
    }

    // Protected method accessible within the same package or subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within the same package or subclasses.");
    }

    // Default (package-private) method accessible only within the same package
    void defaultMethod() {
        System.out.println("Default Method: Accessible only within the same package.");
    }
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        
        // Calling all methods
        am.publicMethod();      // Accessible everywhere
        am.privateMethod();     // Accessible within this class
        am.protectedMethod();   // Accessible within the same package or subclasses
        am.defaultMethod();     // Accessible within the same package
    }
}
