package com.nicky.day4;

import java.util.TreeSet;

public class Demo11 {
    public static void main(String[] args) {
        //create TreeSet and add elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("Paul");
        treeSet.add("Watson");
        treeSet.add("Alice");

        //prints in ascending order because that's how it stores these elements
        treeSet.forEach(set -> {
            System.out.println(set);
        });
    }
}