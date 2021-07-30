package com.nicky.day4.assignments;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
 */
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("cat");
        linkedList.add("dog");
        linkedList.add("fish");
        linkedList.add("lion");
        //lets use iterator to iterate through all the elements in a linked list starting at a specified position
        Iterator iterator = linkedList.listIterator(1); //list.listIterator(index) lets me start at a specified index
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); //starts printing at dog
        }

    }
}
