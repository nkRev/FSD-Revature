package com.nicky.day4.assignments;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 2. Write a Java program to iterate through all elements in a tree set.
 */
public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Green");
        colors.add("White");
        colors.add("Red");

        colors.forEach(color->{
            System.out.println(color);
        });

        //or with iterator
        Iterator iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
