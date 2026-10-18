
import java.util.LinkedHashSet;

public class LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Red");

        System.out.println("LinkedHashSet: " + set);

        set.remove("Blue");

        System.out.println("After removal: " + set);
        System.out.println("Contains Red: " + set.contains("Red"));
    }
}
