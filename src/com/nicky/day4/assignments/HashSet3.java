package com.nicky.day4.assignments;

import java.util.HashSet;

/**
 * 3. Write a Java program to get the number of elements in a hash set.
 */
public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        //prints out size of hashset which is 5
        System.out.println(set.size());
    }
}
