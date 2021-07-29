package com.nicky.day4.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 1. Write a Java program to create a new ArrayList, add some colors (String)
 * and print out the collection
 */
public class Assignment1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Yellow");
        arrayList.add("Purple");
        arrayList.add("Green");
        arrayList.add("Blue");

        //not necessary but allows me to practice using addAll
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("Pink");
        newArrayList.add("White");
        newArrayList.add("Brown");

        //merge newArrayList to the end of arrayList
        arrayList.addAll(newArrayList);

        //sort because why not?
        Collections.sort(arrayList);

        //print arrayList
        System.out.println(arrayList);

    }
}
