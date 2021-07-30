package com.nicky.day4.assignments;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 4. Write a Java program to iterate a linked list in reverse order.
 */
public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add("Mark");
        linkedList.add("Sally");
        linkedList.add("dog");

        System.out.println(linkedList);

        //to iterate in reverse we can use descending iterator
        Iterator iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
