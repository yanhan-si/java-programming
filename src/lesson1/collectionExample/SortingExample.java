package lesson1.collectionExample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();

        names.add("Mike");
        names.add("Bob");
        names.add("Alice");

        //Before  Sorting
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---After sorting---");
        //sorting
        Collections.sort(names);

        //after sorting
        for (String name : names) {
            System.out.println(name);
        }
    }
}
