package com.nicky.day4.exercises;

import java.util.ArrayList;

/**
 * 4. Write a Java program to retrieve an element at ta specified index from
 * given ArrayList
 */
public class Assignment4 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("abc");
        arrayList.add("Champa/Plumerias are the most beautiful flowers out there!");
        arrayList.add(7890);
        arrayList.add(-1);
        arrayList.add(-1000);

        System.out.println(arrayList.get(2));
    }
}
