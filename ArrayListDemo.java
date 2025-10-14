public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList to hold Integer values
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Access an element at a specific index
        int firstNumber = numbers.get(0);
        System.out.println("First number: " + firstNumber);

        // Remove an element from the ArrayList
        numbers.remove(2); // Removes the element at index 2 (30)
        System.out.println("After removal: " + numbers);

        // Check if the ArrayList contains a specific value
        boolean containsTwenty = numbers.contains(20);
        System.out.println("Contains 20? " + containsTwenty);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);
    }
}
