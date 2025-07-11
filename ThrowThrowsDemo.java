public class ThrowThrowsDemo {
    public static void main(String[] args) {
        try {
            // Calling a method that throws an exception
            checkAge(15);
        } catch (Exception e) {
            // Handling the exception
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    // Method that throws an exception if age is less than 18
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
