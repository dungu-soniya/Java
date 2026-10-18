
import java.util.LinkedHashMap;

public class LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "C++");

        System.out.println("LinkedHashMap: " + map);
        System.out.println("Value for key 1: " + map.get(1));

        map.remove(2);

        System.out.println("After removal: " + map);
    }
}
