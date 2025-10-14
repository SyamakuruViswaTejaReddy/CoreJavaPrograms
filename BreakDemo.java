public class BreakDemo {
    public static void main(String[] args) {
        // Using a for loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking the loop at: " + i);
                break; // Exit the loop when i is 6
            }
            System.out.println("Count: " + i);
        }

        // Demonstrating a condition that will not execute
        for (int j = 10; j < 5; j++) {
            System.out.println("This will not print: " + j);
        }
    }
}
