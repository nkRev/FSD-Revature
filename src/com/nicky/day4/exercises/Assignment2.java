package com.nicky.day4.exercises;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 2. Write a Java program to iterate through
 * all the elements in an ArrayList
 */
public class Assignment2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("abc");
        arrayList.add("Plumerias are the most beautiful flowers out there!");
        arrayList.add(7890);
        arrayList.add(-1);
        arrayList.add(-1000);

        //lets iterate through arrayList with
        //for each lambda expression to print in alphabetical
        //note: lambdas are expressions that help iterate, filter, or extract data from a collection
        arrayList.forEach(thing -> {
            System.out.println(thing);
        });
    }
}
