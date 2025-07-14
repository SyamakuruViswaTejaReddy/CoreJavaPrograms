public class VectorDemo {
    public static void main(String[] args) {
        // Create a vector with an initial capacity of 10
        java.util.Vector<String> vector = new java.util.Vector<>(10);

        // Add elements to the vector
        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");

        // Display the elements in the vector
        System.out.println("Vector elements: " + vector);
        // Check if the vector contains a specific element
        if (vector.contains("Element 2")) {
            System.out.println("Vector contains Element 2");
        } else {
            System.out.println("Vector does not contain Element 2");
        }
        // Get an element at a specific index
        String elementAtIndex1 = vector.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);
        // Check the size and capacity of the vector
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Remove an element from the vector
        vector.remove("Element 2");
        System.out.println("After removal: " + vector);
    }
}
