public class FinallyDemo {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            String str = null;
            System.out.println(str.length()); // This will cause a NullPointerException
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("Error: Attempted to access a null object.");
        } finally {
            // This block always executes
            System.out.println("Execution completed.");
        }
    }
}
