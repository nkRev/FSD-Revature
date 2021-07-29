package com.nicky.day4.exercises;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a Java program to swap two elements in an ArrayList
 */
public class Assignment13 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(-10);
        arrayList.add(6);
        arrayList.add(-900);
        arrayList.add(23);
        arrayList.add(1000);

        System.out.println("Original ArrayList: " + arrayList);

        Collections.swap(arrayList, 0, 4); //swaps 1 and 23
        System.out.println(arrayList);

        Collections.swap(arrayList, 2, 5); //swaps 6 and 1000
        System.out.println(arrayList);

        Collections.swap(arrayList, 1, 3); //swaps -10 and -900
        System.out.println(arrayList);
    }
}
