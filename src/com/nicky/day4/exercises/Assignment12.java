package com.nicky.day4.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to extract a portion of
 * an ArrayList
 */
public class Assignment12 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("abc");
        arrayList.add("Plumerias are the most beautiful flowers out there!");
        arrayList.add(7890);
        arrayList.add(-1);
        arrayList.add(-1000);
        System.out.println("Original List: " + arrayList);

        //sublist() allows me to return a portion of this list from List class
        //arrayList.subList(1, 2);
        //I might have to create a new list,
        List arrayList2 = arrayList.subList(1, 3); //begins at index 1 and ends at 3 but does not include it


        System.out.println(arrayList2);
    }
}
