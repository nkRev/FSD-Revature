package com.nicky.day4.assignments;

import java.util.TreeSet;

/**
 * 5. Write a Java program to get the first and last elements in a tree set
 */
public class TreeSet5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("BMW");
        treeSet.add("Honda");
        treeSet.add("Stacy");
        System.out.println(treeSet); //ascending order TreeSet
        //pollFirst and pollLast will retrieve and remove first and last elements
//        System.out.println(treeSet.pollFirst()); //bmw
//        System.out.println(treeSet.pollLast()); //stacy
//        System.out.println(treeSet);
        //first(), last() will retrieve first and last elements without removing it.
        System.out.println(treeSet.first()); //bmw
        System.out.println(treeSet.last()); //stacy
        System.out.println(treeSet);
    }
}
