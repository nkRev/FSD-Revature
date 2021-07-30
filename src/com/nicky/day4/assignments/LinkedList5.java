package com.nicky.day4.assignments;

import java.util.LinkedList;

/**
 * 5. Write a Java program to insert the specified element at the specified position in the linked list.
 */
public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(0);
        linkedList.add("bike");
        linkedList.add("automobile");
        System.out.println(linkedList);

        //to insert a specified element into a list you can use .add(int index, object e)
        linkedList.add(0, "Mark"); //at index 0, Mark will be added to the list
    }
}
