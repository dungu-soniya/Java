
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        System.out.println("Vector: " + vector);

        vector.add(1, "C");

        System.out.println("After insertion: " + vector);
        System.out.println("Element at index 1: " + vector.get(1));

        vector.remove("Python");

        System.out.println("After removal: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
    }
}
