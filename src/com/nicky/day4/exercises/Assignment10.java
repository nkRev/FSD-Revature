package com.nicky.day4.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * write a program to shuffle elements in an ArrayList
 */
public class Assignment10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Yellow");
        arrayList.add("Purple");
        arrayList.add("Green");
        arrayList.add("Blue");
        System.out.println(arrayList);

        //by using a collection
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
