import java.util.ArrayDeque;
import java.util.Deque;

public class EX46 {
    public static void main(String[] args) {
        // Create a Deque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front of the deque
        deque.addFirst("Element 1");
        deque.offerFirst("Element 2");
        deque.push("Element 3");

        // Add elements to the end of the deque
        deque.addLast("Element 4");
        deque.offerLast("Element 5");

        System.out.println("Deque: " + deque);
        // Output: Deque: [Element 3, Element 2, Element 1, Element 4, Element 5]

        // Access elements at the front and end of the deque
        String firstElement = deque.peekFirst();
        String lastElement = deque.peekLast();

        System.out.println("First Element: " + firstElement); // Output: First Element: Element 3
        System.out.println("Last Element: " + lastElement); // Output: Last Element: Element 5

        // Remove elements from the front and end of the deque
        String removedFirst = deque.pollFirst();
        String removedLast = deque.pollLast();

        System.out.println("Removed First Element: " + removedFirst); // Output: Removed First Element: Element 3
        System.out.println("Removed Last Element: " + removedLast); // Output: Removed Last Element: Element 5

        System.out.println("Updated Deque: " + deque);
        // Output: Updated Deque: [Element 2, Element 1, Element 4]

        // Check if the deque contains an element
        boolean contains = deque.contains("Element 1");
        System.out.println("Contains Element 1? " + contains); // Output: Contains Element 1? true

        // Check the size of the deque
        int size = deque.size();
        System.out.println("Size: " + size); // Output: Size: 3

        // Clear all elements from the deque
        deque.clear();
        System.out.println("Cleared Deque: " + deque); // Output: Cleared Deque: []

        // Check if the deque is empty after clearing
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? true
    }
}
