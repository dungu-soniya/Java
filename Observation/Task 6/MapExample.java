
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Soniya");
        map.put(2, "Ravi");
        map.put(3, "Priya");

        System.out.println("Map: " + map);
        System.out.println("Value of key 2: " + map.get(2));

        map.put(2, "Rahul");
        System.out.println("After Update: " + map);

        map.remove(3);
        System.out.println("After Removal: " + map);

        System.out.println("Contains key 1: " + map.containsKey(1));
    }
}
