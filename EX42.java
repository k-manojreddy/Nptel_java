import java.util.ArrayList;
import java.util.Collection;

public class EX42 {
    public static void main(String[] args) {
        // Create a collection (ArrayList) of integers
        Collection<Integer> numbers = new ArrayList<>();

        // Add elements to the collection
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Collection: " + numbers); // Output: Collection: [10, 20, 30]

        // Check the size of the collection
        int size = numbers.size();
        System.out.println("Size: " + size); // Output: Size: 3

        // Check if the collection is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? false

        // Check if the collection contains a specific element
        boolean contains = numbers.contains(20);
        System.out.println("Contains 20? " + contains); // Output: Contains 20? true

        // Remove an element from the collection
        boolean removed = numbers.remove(20);
        System.out.println("Removed 20? " + removed); // Output: Removed 20? true
        System.out.println("Updated Collection: " + numbers); // Output: Updated Collection: [10, 30]

        // Clear all elements from the collection
        numbers.clear();
        System.out.println("Cleared Collection: " + numbers); // Output: Cleared Collection: []

        // Check the size again after clearing the collection
        size = numbers.size();
        System.out.println("Size: " + size); // Output: Size: 0

        // Check if the collection is empty after clearing
        isEmpty = numbers.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? true
    }
}
