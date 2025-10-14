public class ArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the elements of the array using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Demonstrating an array with a condition that will not execute
        if (numbers.length > 10) {
            System.out.println("This will not print as the array length is not greater than 10.");
        }
    }
}
