
import java.util.*;

public class ListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> it = list.listIterator();

        System.out.println("Forward Direction:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward Direction:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
