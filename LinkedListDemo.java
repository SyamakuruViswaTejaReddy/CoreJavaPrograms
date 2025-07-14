public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Display the elements in the linked list
        System.out.println("Linked List elements: " + linkedList);

        // Check if the linked list contains a specific element
        if (linkedList.contains("Element 2")) {
            System.out.println("Linked List contains Element 2");
        } else {
            System.out.println("Linked List does not contain Element 2");
        }

        // Get an element at a specific index
        String elementAtIndex1 = linkedList.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // Check the size of the linked list
        System.out.println("Size: " + linkedList.size());

        // Remove an element from the linked list
        linkedList.remove("Element 2");
        System.out.println("After removal: " + linkedList);
    }
}
