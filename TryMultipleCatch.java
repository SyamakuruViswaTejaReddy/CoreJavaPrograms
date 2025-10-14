public class TryMultipleCatch {
    public static void main(String[] args) {
        try {
            // Code that may throw multiple exceptions
            String str = null;
            System.out.println(str.length()); // This will cause a NullPointerException
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("Error: Attempted to access a null object.");
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block always executes
            System.out.println("Execution completed.");
        }
    }
}
