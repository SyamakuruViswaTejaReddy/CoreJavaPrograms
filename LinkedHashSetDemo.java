public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        java.util.LinkedHashSet<String> linkedSet = new java.util.LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");
        linkedSet.add("Date");

        // Display the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedSet);
        
        // Check the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedSet.size());
        
        // Check if the LinkedHashSet is empty
        System.out.println("Is LinkedHashSet empty? " + linkedSet.isEmpty());
        
        // Check if an element exists
        if (linkedSet.contains("Banana")) {
            System.out.println("Banana is in the LinkedHashSet.");
        } else {
            System.out.println("Banana is not in the LinkedHashSet.");
        }
        // Check if an element does not exist
        if (!linkedSet.contains("Grapes")) {
            System.out.println("Grapes is not in the LinkedHashSet.");
        } else {
            System.out.println("Grapes is in the LinkedHashSet.");
        }
        // Remove an element
        linkedSet.remove("Date");
        System.out.println("After removing Date: " + linkedSet);

        // Iterate through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for (String fruit : linkedSet) {
            System.out.println(fruit);
        }
    }
    
}
