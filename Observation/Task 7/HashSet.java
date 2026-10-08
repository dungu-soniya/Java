import java.util.HashSet;

public class HashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");

        System.out.println("HashSet: " + set);

        set.remove("Banana");

        System.out.println("After removing: " + set);
        System.out.println("Contains Mango: " + set.contains("Mango"));
        System.out.println("Size: " + set.size());
    }
}
