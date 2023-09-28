import java.util.HashSet;
import java.util.Set;

public class EX45 {
    public static void main(String[] args) {
        // Create a set of strings
        Set<String> names = new HashSet<>();

        // Add elements to the set
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        System.out.println("Set: " + names); // Output: Set: [Bob, Alice, John]

        // Check the size of the set
        int size = names.size();
        System.out.println("Size: " + size); // Output: Size: 3

        // Check if the set is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? false

        // Check if the set contains a specific element
        boolean contains = names.contains("Alice");
        System.out.println("Contains Alice? " + contains); // Output: Contains Alice? true

        // Remove an element from the set
        boolean removed = names.remove("Bob");
        System.out.println("Removed Bob? " + removed); // Output: Removed Bob? true
        System.out.println("Updated Set: " + names); // Output: Updated Set: [Alice, John]

        // Clear all elements from the set
        names.clear();
        System.out.println("Cleared Set: " + names); // Output: Cleared Set: []

        // Check the size again after clearing the set
        size = names.size();
        System.out.println("Size: " + size); // Output: Size: 0

        // Check if the set is empty after clearing
        isEmpty = names.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? true
    }
}
