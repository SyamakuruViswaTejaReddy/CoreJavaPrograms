public class MultipleInheritance implements InterfaceA, InterfaceB {
    // Implementing method from InterfaceA
    public void MethodA() {
        System.out.println("MethodA from InterfaceA implemented.");
    }
    // Implementing method from InterfaceB
    public void MethodB() {
        System.out.println("MethodB from InterfaceB implemented.");
    }
    // Implementing a generic method from both interfaces
    public void MethodGeneric() {
        System.out.println("MethodGeneric from both interfaces implemented.");
    }   
    public static void main(String[] args) {
        // Create an instance of the derived class
        MultipleInheritance mp = new MultipleInheritance();
        
        // Call methods from both interfaces
        mp.MethodA();         // Method from InterfaceA     
        mp.MethodB();         // Method from InterfaceB
        mp.MethodGeneric();   // Method from both interfaces     
        System.out.println("Multiple inheritance using interfaces in Java.");
    }
}
