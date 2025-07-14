public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");

        // Display the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Check the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Check if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Check if an element exists
        if (treeSet.contains("Banana")) {
            System.out.println("Banana is in the TreeSet.");
        } else {
            System.out.println("Banana is not in the TreeSet.");
        }
        // Check if an element does not exist
        if (!treeSet.contains("Grapes")) {
            System.out.println("Grapes is not in the TreeSet.");
        } else {
            System.out.println("Grapes is in the TreeSet.");
        }   
        // Check if the TreeSet contains a specific element
        if (treeSet.contains("Cherry")) {
            System.out.println("Cherry is in the TreeSet.");
        } else {
            System.out.println("Cherry is not in the TreeSet.");
        }
        
        // Remove an element
        treeSet.remove("Date");
        System.out.println("After removing Date: " + treeSet);

        // Iterate through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
