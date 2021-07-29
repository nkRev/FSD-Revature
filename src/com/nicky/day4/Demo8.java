package com.nicky.day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo8 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Stacy");
        names.add("Justin");

        // adding element to specified position
        names.add(0, "John");
        System.out.println(names);

        //adding second list
        LinkedList<String> newNames = new LinkedList<>();
        newNames.add("Smith");
        newNames.add("Albert");

        //adding names to end of list
//        names.addAll(newNames);
//        System.out.println(names);

        //adding names at specified index
        names.addAll(0, newNames);
        System.out.println(names);

        //addFirst();
        names.addFirst("First");
        System.out.println(names);

        //addLast();
        names.addLast("Last");
        System.out.println(names);


        //remove()

        //removeFirst
        names.removeFirst();
        System.out.println(names);

        //removeLast
        names.removeLast();
        System.out.println(names);

        names.add("John");
        names.add("Paul");
        System.out.println(names);

        //removeFirstOccurrence
        names.removeFirstOccurrence("John");
        System.out.println(names);

        //removeLastOccurrence
        names.removeLastOccurrence("Paul");
        System.out.println(names);

        //reverse elements
        System.out.println("original:");
        System.out.println(names);

        //traversing array elements in reverse order
        Iterator iterator = names.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        //or I can use for loop
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}
