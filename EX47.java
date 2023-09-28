import java.util.SortedSet;
import java.util.TreeSet;

public class EX47 {
    public static void main(String[] args) {
        // Create a SortedSet (TreeSet) of integers
        SortedSet<Integer> numbers = new TreeSet<>();

        // Add elements to the SortedSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        System.out.println("SortedSet: " + numbers); // Output: SortedSet: [1, 2, 4, 5, 8]

        // Check the first and last elements in the SortedSet
        Integer firstElement = numbers.first();
        Integer lastElement = numbers.last();
        System.out.println("First Element: " + firstElement); // Output: First Element: 1
        System.out.println("Last Element: " + lastElement); // Output: Last Element: 8

        // Get a subset of elements within a range in the SortedSet
        SortedSet<Integer> subset = numbers.subSet(2, 5);
        System.out.println("Subset: " + subset); // Output: Subset: [2, 4, 5]

        // Get a subset of elements less than a given value in the SortedSet
        SortedSet<Integer> headSet = numbers.headSet(5);
        System.out.println("Head Set: " + headSet); // Output: Head Set: [1, 2, 4]

        // Get a subset of elements greater than or equal to a given value in the SortedSet
        SortedSet<Integer> tailSet = numbers.tailSet(5);
        System.out.println("Tail Set: " + tailSet); // Output: Tail Set: [5, 8]

        // Remove an element from the SortedSet
        boolean removed = numbers.remove(4);
        System.out.println("Removed 4? " + removed); // Output: Removed 4? true
        System.out.println("Updated SortedSet: " + numbers); // Output: Updated SortedSet: [1, 2, 5, 8]

        // Clear all elements from the SortedSet
        numbers.clear();
        System.out.println("Cleared SortedSet: " + numbers); // Output: Cleared SortedSet: []

        // Check if the SortedSet is empty after clearing
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is Empty? " + isEmpty); // Output: Is Empty? true
    }
}
