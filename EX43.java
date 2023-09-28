import java.util.ArrayList;
import java.util.List;

public class EX43 {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("List: " + fruits); // Output: List: [Apple, Banana, Orange]

        // Get the element at a specific index
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit); // Output: First Fruit: Apple

        // Set an element at a specific index
        fruits.set(1, "Mango");
        System.out.println("Updated List: " + fruits); // Output: Updated List: [Apple, Mango, Orange]

        // Check if the list contains a specific element
        boolean contains = fruits.contains("Orange");
        System.out.println("Contains Orange? " + contains); // Output: Contains Orange? true

        // Check the index of a specific element
        int index = fruits.indexOf("Mango");
        System.out.println("Index of Mango: " + index); // Output: Index of Mango: 1

        // Remove an element at a specific index
        String removedFruit = fruits.remove(0);
        System.out.println("Removed Fruit: " + removedFruit); // Output: Removed Fruit: Apple
        System.out.println("Updated List: " + fruits); // Output: Updated List: [Mango, Orange]

        // Check the size of the list
        int size = fruits.size();
        System.out.println("Size: " + size); // Output: Size: 2

        // Clear all elements from the list
        fruits.clear();
        System.out.println("Cleared List: " + fruits); // Output: Cleared List: []

        // Check if the list is empty after clearing
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? true
    }
}
