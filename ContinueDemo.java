public class ContinueDemo {
    public static void main(String[] args) {
        // Using a for loop with continue statement
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Skip even numbers
                continue;
            }
            System.out.println("Odd number: " + i);
        }

        // Demonstrating a condition that will not execute
        for (int j = 10; j < 5; j++) {
            System.out.println("This will not print: " + j);
        }
    }
}
