package com.nicky.day4.assignments;

import java.util.LinkedList;

/**
 * 2. Write a Java program to iterate through all elements in a linked list.
 */
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add("Mark");
        linkedList.add("Sally");
        linkedList.add("dog");
        System.out.println("Original LinkedList: " + linkedList);
        //use foreach to iterate through all elements of LinkedList
//        for (Object o : linkedList) {
//            System.out.println(o);
//        }
        //could use forEach() too
        linkedList.forEach(o ->{
            System.out.println(o);
        });

    }
}
