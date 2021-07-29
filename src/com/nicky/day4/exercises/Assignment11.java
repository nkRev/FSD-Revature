package com.nicky.day4.exercises;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a java program to reverse elements in an ArrayList
 */

public class Assignment11 {
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

        //sort for better readability
        Collections.sort(arrayList);
        System.out.println(arrayList);

        //Collections.reverse(), ArrayList does not have to be sorted
        //because Collections.reverse() wil reverse the order of the ArrayList
        //by the order they are inserted by .add() method
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
