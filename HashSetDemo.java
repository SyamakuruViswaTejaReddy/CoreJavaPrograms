public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        java.util.HashSet<String> set = new java.util.HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Display the HashSet
        System.out.println("HashSet: " + set);
        // Check the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());
        // Check if the HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());
        
        // Check if an element exists
        if (set.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        } else {
            System.out.println("Banana is not in the HashSet.");
        }

        // Remove an element
        set.remove("Date");
        System.out.println("After removing Date: " + set);

        // Iterate through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    } 
}
