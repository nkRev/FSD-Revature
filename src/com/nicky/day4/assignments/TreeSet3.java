package com.nicky.day4.assignments;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

/**
 * 3. Write a Java program to add all the elements of a specified tree set to another tree set.
 */
public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Green");
        colors.add("White");
        colors.add("Red");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("BMW");
        treeSet.add("Honda");
        treeSet.add("Stacy");

        //treeset will reorder elements in ascending order...
        colors.addAll(treeSet);
        System.out.println(colors);
    }
}
