package com.nicky.day4.assignments;

import java.util.TreeSet;

/**
 * Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
 */
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Green");
        colors.add("White");
        colors.add("Red");
        System.out.println(colors);
    }
}
