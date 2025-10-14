public class MethodDemo {
    public static void main(String[] args) {
        // Calling the addNumbers method and storing the result
        int sum = addNumbers(5, 10);
        System.out.println("The sum is: " + sum);
    }

    // Method to add two numbers and return the result
    public static int addNumbers(int a, int b) {
        return a + b; // Returns the sum to the caller
    }
}
