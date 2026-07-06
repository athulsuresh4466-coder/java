import java.util.*;

public class ListMethodsDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // add()
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("After add(): " + list);

        // add(index, element)
        list.add(1, "Orange");
        System.out.println("After add(index): " + list);

        // get()
        System.out.println("get(2): " + list.get(2));

        // set()
        list.set(0, "Grapes");
        System.out.println("After set(): " + list);

        // contains()
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // size()
        System.out.println("Size: " + list.size());

        // indexOf()
        System.out.println("Index of Mango: " + list.indexOf("Mango"));

        // remove()
        list.remove("Banana");
        System.out.println("After remove(): " + list);

        // isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());

        // subList()
        System.out.println("SubList: " + list.subList(0, 2));

        // sort()
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // iterator()
        System.out.print("Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // toArray()
        Object[] arr = list.toArray();
        System.out.print("\nArray: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }

        // clear()
        list.clear();
        System.out.println("\nAfter clear(): " + list);

        // isEmpty()
        System.out.println("Is Empty After Clear? " + list.isEmpty());
    }
}