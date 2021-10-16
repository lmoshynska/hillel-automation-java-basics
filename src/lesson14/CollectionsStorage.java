package lesson14;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsStorage {

    public List<String> getStrArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Banana");
        list.add("Banana");
        list.add("Grapes");

        return list;
    }

    public static List<Integer> getIntegerArrayList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        return list;
    }

    public List<String> getLinkedList() {
        List<String> list = new LinkedList<>();
        list.add("Kyiv");
        list.add("London");
        list.add("Rome");
        list.add("Paris");
        list.add("Paris");
        list.add("Paris");

        return list;
    }

    public static Set<String> getHashSet() {
        Set<String> list = new HashSet<String>();
        list.add("Kyiv");
        list.add("London");
        list.add("Rome");
        list.add("Paris");

        return list;
    }
}
