package com.nicky.day4.exercises;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Write a Java program to insert an element into the array
 * at the first position.
 */
public class Assignment3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //add to array list
        arrayList.add(1);
        arrayList.add(-10);
        arrayList.add(6);
        arrayList.add(-900);
        arrayList.add(23);
        arrayList.add(1000);
        //for better readability
        Collections.sort(arrayList);
        System.out.println(arrayList);
        arrayList.add(1, 92);
        arrayList.add(3, 23);
        arrayList.add(6, 0);

        System.out.println(arrayList);
    }
}
