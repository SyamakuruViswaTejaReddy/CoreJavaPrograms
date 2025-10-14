public class StaticDemo {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println("Static method called. Static variable value: " + staticVariable);
    }
    //static block
    static {    
        System.out.println("Static block executed. Initial static variable value: " + staticVariable);
    }

    public static void main(String[] args) {
        // Accessing static variable and method without creating an instance
        System.out.println("Static Variable: " + staticVariable);
        staticMethod();

        // Modifying the static variable
        staticVariable = 20;
        System.out.println("Modified Static Variable: " + staticVariable);
        staticMethod();
    } 
}
