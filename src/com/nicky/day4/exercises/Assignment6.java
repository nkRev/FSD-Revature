package com.nicky.day4.exercises;

import java.util.ArrayList;

/**
 * write a Java program to remove the third element
 * from an ArrayList
 */
public class Assignment6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //add to array list
        arrayList.add(1);
        arrayList.add(-10);
        arrayList.add(6);
        arrayList.add(-900);
        arrayList.add(23);
        arrayList.add(1000);
        System.out.println(arrayList);

        //start at 0 end at 2 for third element
        arrayList.remove(2);
        System.out.println(arrayList); //6 is removed


    }
}
