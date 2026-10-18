
import java.util.TreeMap;

public class TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Mango");

        System.out.println("TreeMap: " + map);
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());

        map.remove(2);

        System.out.println("After removal: " + map);
    }
}
