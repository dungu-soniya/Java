
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10);

        System.out.println("TreeSet: " + set);
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        set.remove(20);

        System.out.println("After removal: " + set);
        System.out.println("Size: " + set.size());
    }
}
