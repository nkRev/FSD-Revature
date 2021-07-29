package com.nicky.day4.exercises;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * write a Java program that copies one ArrayList to another
 */
public class Assignment9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //add to array list
        arrayList.add(1);
        arrayList.add(-10);
        arrayList.add(6);
        arrayList.add(-900);
        arrayList.add(23);
        arrayList.add(1000);

        //pre-copy
        System.out.println(arrayList);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        //newArrayList.addAll(arrayList); //"copies" arrayList, but it literally just adds it into the new list
        System.out.println(newArrayList);

        //lets try a new way
//        newArrayList.clear();
//        System.out.println(newArrayList);
//        newArrayList = new ArrayList<>(arrayList); //this would copy it in a way
//        System.out.println(newArrayList);

        //is there a collection?
        //newArrayList.clear(); //will throw an IndexOutOfBounds
        System.out.println(newArrayList);
        // it may be risky
        try {
            //YES THERE IS! (destination, source)
            Collections.copy(newArrayList, arrayList);
            System.out.println(newArrayList);
        } catch (IndexOutOfBoundsException e) {
            //if arraylist is empty, the destination might not be the right size for the source
            //so it throws an IndexOutOfBoundsException
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
