package SortedSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet NS = new TreeSet();
        NS.add(15);
        NS.add(5);
        NS.add(20);
        NS.add(30);
        NS.add(26);

        NS=NS.descendingSet();
        System.out.println(NS);
        System.out.println("lower: "+NS.lower(10)); // return Exactly just previous value
        System.out.println("higher: "+NS.higher(25)); // return Exactly just next value

        System.out.println("floor: "+NS.floor(20));     // return Equal or previous value
        System.out.println("ceiling: "+NS.ceiling(5)); // return Equal or next value

        System.out.println("Remove First Lower: "+NS.pollFirst()); // remove first element
        System.out.println("Remove First Higher: "+NS.pollLast());  // remove last element
        System.out.println(NS);

        NS=NS.descendingSet(); // for arranging in descending order
        System.out.println(NS);


    }
}
