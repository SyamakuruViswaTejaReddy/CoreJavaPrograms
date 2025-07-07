public class GarbageCollector {
    public static void main(String[] args) {
        // Create an object
        Object obj = new Object();
        
        // Nullify the reference to make it eligible for garbage collection
        obj = null;
        
        // Suggest garbage collection
        System.gc();
        
        // Print a message indicating that garbage collection has been suggested
        System.out.println("Garbage collection has been suggested.");
    }
}
