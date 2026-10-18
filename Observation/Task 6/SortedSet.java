
import java.util.*;

public class SortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(40);
        set.add(20);
        set.add(10);

        System.out.println("Sorted Set: " + set);
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());
        System.out.println("Head Set: " + set.headSet(30));
        System.out.println("Tail Set: " + set.tailSet(20));
    }
}
