package com.nicky.day4;

import java.util.TreeSet;

public class Demo12 {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(-1);
        treeSet.add(2);
        treeSet.add(30);
        treeSet.add(4);
        treeSet.add(18);
        treeSet.add(0);
        treeSet.add(92);
        treeSet.add(14);

        //prints in ascending order
        treeSet.forEach(num -> {
            System.out.print(num + " ");
        });
        System.out.println();

        //pollFirst() used to retrieve and remove the lowest (first) element, will return null if empty
        System.out.println("Lowest: " + treeSet.pollFirst() + " ");
        System.out.println(treeSet);
        //pollLast() used to retrieve and remove the highest (last) element, will return null if empty
        System.out.println("Highest: " + treeSet.pollLast() + " ");
        System.out.println(treeSet);
    }
}
