import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("ArrayList: " + list);

        list.add(1, "Orange");
        System.out.println("After adding: " + list);

        list.remove("Banana");
        System.out.println("After removing: " + list);

        System.out.println("Size: " + list.size());
        System.out.println("Contains Mango: " + list.contains("Mango"));
    }
}
