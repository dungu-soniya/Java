
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");

        System.out.println("List: " + list);
        System.out.println("Element at index 1: " + list.get(1));

        list.set(1, "Orange");
        System.out.println("After Update: " + list);

        list.remove("Mango");
        System.out.println("After Removal: " + list);

        System.out.println("Size: " + list.size());
    }
}
