package com.nicky.day4.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 1. Write a Java program to append the specified element to the end of a hash set.
 */
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println(set); //no specific order
        set.add("Six");
        System.out.println(set); //still no specific order
        //LinkedHashSets retain order
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        System.out.println(linkedHashSet); //this order will stay
        linkedHashSet.add("boat");
        System.out.println(linkedHashSet); //boat gets added to the end of the "HashSet"

    }
}
