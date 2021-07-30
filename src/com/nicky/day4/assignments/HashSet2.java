package com.nicky.day4.assignments;

import java.util.HashSet;

/**
 * 2. Write a Java program to iterate through all elements in a hash list.
 */
public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println(set);

        //for each item in the set, print out the item
        set.forEach(item -> {
            System.out.println(item);
        });
    }
}
