
import java.util.*;

public class Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);

        System.out.println("Set: " + set);
        System.out.println("Contains 20: " + set.contains(20));

        set.remove(30);
        System.out.println("After Removal: " + set);

        System.out.println("Size: " + set.size());
    }
}
