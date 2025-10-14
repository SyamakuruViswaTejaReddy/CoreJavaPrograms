public class ReturnDemo {
    public static void main(String[] args) {
        // Calling the method and printing the returned value
        int result = addNumbers(5, 10);
        System.out.println("The sum is: " + result);
        
        // Demonstrating early return
        int value = 15;
        if (value > 10) {
            System.out.println("Value is greater than 10, returning early.");
            return; // Exiting the method early
        }
        
        System.out.println("This line will not execute if value > 10");
    }

    // Method that returns the sum of two integers
    public static int addNumbers(int a, int b) {
        return a + b; // Returning the sum
    }
}
