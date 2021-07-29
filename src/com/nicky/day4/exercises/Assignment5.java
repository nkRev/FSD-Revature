package com.nicky.day4.exercises;

import java.util.ArrayList;

/**
 * write a Java program to update a specific
 * array element by given element
 */
public class Assignment5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Yellow");
        arrayList.add("Purple");
        arrayList.add("Green");
        arrayList.add("Blue");
        System.out.println(arrayList);

        arrayList.set(2, "Pink");
        arrayList.set(0, "Brown");
        System.out.println(arrayList);
    }
}
