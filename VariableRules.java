public class VariableRules {
    public static void main(String[] args) {
        // Declare a variable
        int number = 10;

        // Print the variable
        System.out.println("The number is: " + number);

        // Change the value of the variable
        number = 20;

        // Print the updated variable
        System.out.println("The updated number is: " + number);
        
        // Declare a constant
        final int CONSTANT_NUMBER = 100;

        // Print the constant
        System.out.println("The constant number is: " + CONSTANT_NUMBER);

        // Uncommenting the next line will cause a compilation error
        // CONSTANT_NUMBER = 200; // Cannot change the value of a constant  
        // Demonstrating variable scope
        {
            int innerNumber = 30; // This variable is only accessible within this block
            System.out.println("Inner number: " + innerNumber);
        }
        // Uncommenting the next line will cause a compilation error
        // System.out.println("Inner number: " + innerNumber); // Cannot access innerNumber
        // Demonstrating variable shadowing
        int shadowedNumber = 40; // Outer variable
        {
           // int shadowedNumber = 50; // Inner variable with the same name
            System.out.println("Inner shadowed number: " + shadowedNumber); // Prints 50
        }
        System.out.println("Outer shadowed number: " + shadowedNumber); // Prints 40
        
        // Demonstrating variable initialization    
        int initializedNumber; // Declaration
        initializedNumber = 60; // Initialization   
        System.out.println("Initialized number: " + initializedNumber); // Prints 60
        // Demonstrating variable type inference (Java 10+)
        var inferredNumber = 70; // Type inferred as int    
        System.out.println("Inferred number: " + inferredNumber); // Prints 70  
        // Demonstrating variable naming conventions
        int validVariableName = 80; // Valid variable name
        int _validVariableName = 90; // Valid variable name with underscore
        int $validVariableName = 100; // Valid variable name with dollar sign
        // int 1invalidVariableName = 110; // Invalid variable name (cannot start with a digit)
        System.out.println("Valid variable names: " + validVariableName + ", " + _validVariableName + ", " + $validVariableName);   
    }
}
