package com.nicky.day4.exercises;

import java.util.ArrayList;

/**
 * write a Java program to search an element in an ArrayList
 */
public class Assignment7 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        arrayList.add("Stacy");
        arrayList.add("Jack");
        arrayList.add("Raul");
        System.out.println(arrayList);


        System.out.println(arrayList.contains("John"));
        System.out.println(arrayList.contains("Nicky"));

    }
}
