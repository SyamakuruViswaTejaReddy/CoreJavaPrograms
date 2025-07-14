public class PriorityQueueDemo {
    //priority queue implementation in java collection framework
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(30);
        pq.add(25);

        System.out.println("Priority Queue: " + pq);
        // Peek at the head of the priority queue
        System.out.println("Head of the queue: " + pq.peek());
        // Check if the priority queue contains a specific element
        System.out.println("Contains 15? " + pq.contains(15));
        // Get the size of the priority queue
        System.out.println("Size of the queue: " + pq.size());
        // Iterate through the priority queue
        System.out.println("Iterating through the queue:"); 
        for (Integer num : pq) {
            System.out.println(num);
        }
        // Remove elements from the priority queue
        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}
