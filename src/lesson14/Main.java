package lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        CollectionsStorage storage = new CollectionsStorage();
        List<String> arrList1 = storage.getStrArrayList();

        List<String > linkedList = storage.getLinkedList();

        System.out.println(arrList1);
        System.out.println(linkedList);

        Main mainObj = new Main();
        System.out.println(mainObj.getDistinct(arrList1));
        System.out.println(mainObj.getDistinct(linkedList));


        /*System.out.println(arrList1);

        List<String> arrList2 = new ArrayList<>(arrList1);
        arrList2.add("Orange");
        System.out.println(arrList1);
        System.out.println(arrList2);*/

        /*String[] someValues = {"One", "Two"};
        List<String> list3 = new ArrayList<>(Arrays.asList(someValues));
        System.out.println(list3);
        List<String> list4 = new ArrayList<>(Arrays.asList("Three", "Four"));
        System.out.println(list4);*/
        //Arrays.asList
        //add, set, remove, addAll, size
        //contains, containsAll
        //get, indexOf, lastIndexOf
        //Collections.sort, max, min
        //iterate through list
        //create list of Objects
        //compare lists

//        arrList2.set(2, "Melon");
//        System.out.println(arrList2);
//        arrList2.remove("Orange");
//        arrList2.remove(0);
//        arrList2.addAll(arrList1);
//        System.out.println(arrList2);
//
//        System.out.println(arrList2.contains("Grapes"));
//        System.out.println(arrList2.containsAll(arrList1));
//
//        Collections.swap(arrList2, 1,4);
//        System.out.println(arrList2);
//        System.out.println(arrList2.containsAll(arrList1));

//        List<String> arrList3 = CollectionsStorage.getStrArrayList();
//        System.out.println(arrList1.equals(arrList3));
//        Collections.swap(arrList3, 1,2);
//        System.out.println(arrList3);
//        System.out.println(arrList1.equals(arrList3));
//        System.out.println(arrList1.containsAll(arrList3));


        /*List<String> linkedList1 = CollectionsStorage.getLinkedList();
        System.out.println(linkedList1);*/
//        List<String> linkedList2 = new LinkedList<>(arrList3);
//        System.out.println(linkedList1);

//        Queue<Integer> queue = new LinkedList<>(CollectionsStorage.getIntegerArrayList());
//        //peek, poll, add
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        queue.poll();
//        System.out.println(queue);
//        queue.add(23);
//        System.out.println(queue);
//
//        Deque<Integer> deque = new LinkedList<>();
//        deque.push(1);
//        deque.push(2);
//        deque.push(3);
//        System.out.println(deque);
//        deque.pop();
//        System.out.println(deque);
//        deque.push(13);
//        System.out.println(deque);


        /*Set<String> set = CollectionsStorage.getHashSet();
        System.out.println(set);
        set.add("Athens");
        System.out.println(set);
        Set<String> set1 = new HashSet<>(linkedList1);
        System.out.println(set1);*/

        //collections as set elements
        //adding duplicates
    }

    public List<String> getDistinct(List<String> initList) {
        return initList.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
