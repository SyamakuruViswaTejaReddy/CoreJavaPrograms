public class CustomException {
    public static void main(String[] args) {
        try {
            // Simulating a condition that throws a custom exception
            validateAge(15);
        } catch (AgeNotValidException e) {
            // Handling the custom exception
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
// Custom exception class
    static class AgeNotValidException extends Exception {
        public AgeNotValidException(String message) {
            super(message);
        }
    }
    // Method that throws a custom exception if age is less than 18
    public static void validateAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
