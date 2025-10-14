public class DeQueueDemo {
    // Deque (Double-Ended Queue) implementation in Java Collection Framework
    public static void main(String[] args) {
        java.util.Deque<Integer> deque = new java.util.ArrayDeque<>();

        // Adding elements to the deque
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);

        System.out.println("Deque: " + deque);

        // Peek at the first and last elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());
        // Check if the deque contains a specific element
        System.out.println("Contains 15? " + deque.contains(15));
        // Get the size of the deque
        System.out.println("Size of the deque: " + deque.size());
        // Iterate through the deque
        System.out.println("Iterating through the deque:");
        for (Integer num : deque) {
            System.out.println(num);
        }
        // Check if the deque is empty
        System.out.println("Is the deque empty? " + deque.isEmpty());
        // Remove elements from the deque
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        System.out.println("Deque after removals: " + deque);
    }
}
