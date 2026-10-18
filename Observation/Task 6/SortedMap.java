
import java.util.*;

public class SortedMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        map.put(40, "D");

        System.out.println("Sorted Map: " + map);
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("Head Map: " + map.headMap(30));
        System.out.println("Tail Map: " + map.tailMap(20));
    }
}
