
package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Kiwi");

        System.out.println("Initial Collection");
        System.out.println(fruits);

        Collection<String> newFruits = new ArrayList<>();

        newFruits.add("Orange");
        newFruits.add("Papaya");

        // Adding another collection
        fruits.addAll(newFruits);

        System.out.println("\nAfter Adding New Fruits");
        System.out.println(fruits);

        // Checking an element
        if (fruits.contains("Mango")) {
            System.out.println("\nMango is available");
        }

        // Checking another collection
        System.out.println("All new fruits available: "
                + fruits.containsAll(newFruits));

        // Displaying collection size
        System.out.println("Total fruits: " + fruits.size());

        // Removing one element
        fruits.remove("Kiwi");

        System.out.println("\nAfter removing Kiwi");
        System.out.println(fruits);

        // Removing multiple elements
        fruits.removeAll(newFruits);

        System.out.println("After removing new fruits");
        System.out.println(fruits);

        // Iterator
        System.out.println("\nDisplaying using Iterator:");

        Iterator<String> fruitIterator = fruits.iterator();

        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
        }

        System.out.println("\nCollection empty: " + fruits.isEmpty());

        // Clearing collection
        fruits.clear();

        System.out.println("After clear: " + fruits);
        System.out.println("Collection empty now: " + fruits.isEmpty());
    }
}
