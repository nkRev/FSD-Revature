package com.nicky.day4.assignments;

import java.util.LinkedList;

/**
 * 1. Write a Java program to append the specified element to the end of a linked list.
 */
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add("water");
        linkedList.add("Mark");

        System.out.println("Original list: " + linkedList);

        //the string Java programming is added to the end of the linked list
        linkedList.addLast("Java programming");
        System.out.println(linkedList);

    }
}
