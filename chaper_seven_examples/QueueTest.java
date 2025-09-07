public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // 1. Initial state
        System.out.println("Initial state:");
        System.out.println("Is empty? " + queue.isEmpty()); // true
        System.out.println("Is full? " + queue.isFull());   // false
        System.out.println("Size: " + queue.size());        // 0
        System.out.println();

        // 2. Enqueue operations
        System.out.println("Adding elements:");
        System.out.println("Enqueue A: " + queue.queue("A"));
        System.out.println("Enqueue B: " + queue.queue("B"));
        System.out.println("Enqueue C: " + queue.queue("C"));
        System.out.println("Enqueue D: " + queue.queue("D"));
        System.out.println("Enqueue E (should fail): " + queue.queue("E")); // should return false
        System.out.println("Size: " + queue.size()); // should be 4
        queue.showElements();
        System.out.println();

        // 3. Dequeue operations
        System.out.println("Removing elements:");
        System.out.println("Dequeue: " + queue.dequeue()); // A
        System.out.println("Dequeue: " + queue.dequeue()); // B
        System.out.println("Size: " + queue.size()); // should be 2
        queue.showElements();
        System.out.println();

        // 4. Add again after removing
        System.out.println("Adding more elements after dequeue:");
        System.out.println("Enqueue E: " + queue.queue("E"));
        System.out.println("Enqueue F (should fail if full): " + queue.queue("F"));
        System.out.println("Size: " + queue.size());
        queue.showElements();
        System.out.println();

        // 5. Clear the queue
        System.out.println("Clearing queue:");
        queue.clear();
        System.out.println("Is empty? " + queue.isEmpty()); // true
        System.out.println("Size: " + queue.size());        // 0
        queue.showElements();
    }
}

