import java.util.LinkedList;
import java.util.Queue;

public class EX44 {
    public static void main(String[] args) {
        // Create a queue of integers
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue); // Output: Queue: [10, 20, 30]

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size: " + size); // Output: Size: 3

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? false

        // Peek at the first element in the queue
        int firstElement = queue.peek();
        System.out.println("First Element: " + firstElement); // Output: First Element: 10

        // Remove the first element from the queue
        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement); // Output: Removed Element: 10
        System.out.println("Updated Queue: " + queue); // Output: Updated Queue: [20, 30]

        // Add another element to the queue
        queue.add(40);
        System.out.println("Updated Queue: " + queue); // Output: Updated Queue: [20, 30, 40]

        // Check if the queue contains a specific element
        boolean contains = queue.contains(30);
        System.out.println("Contains 30? " + contains); // Output: Contains 30? true

        // Remove all elements from the queue
        queue.clear();
        System.out.println("Cleared Queue: " + queue); // Output: Cleared Queue: []

        // Check the size again after clearing the queue
        size = queue.size();
        System.out.println("Size: " + size); // Output: Size: 0

        // Check if the queue is empty after clearing
        isEmpty = queue.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? true
    }
}
