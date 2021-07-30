package com.nicky.day4.assignments;

import java.util.TreeSet;

/**
 * 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
 */
public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("BMW");
        treeSet.add("Honda");
        treeSet.add("Stacy");
        System.out.println(treeSet);

        System.out.println(treeSet.descendingSet());
    }
}
