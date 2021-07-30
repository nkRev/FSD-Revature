package com.nicky.day4.assignments;

import java.util.HashSet;

/**
 * 4. Write a Java program to empty an hash set.
 */
public class HashSet4 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        System.out.println(colors);
        //emptying Hashset
        colors.clear();
        System.out.println(colors);
    }
}
