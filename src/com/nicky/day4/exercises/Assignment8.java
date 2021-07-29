package com.nicky.day4.exercises;

import java.util.ArrayList;
import java.util.Collections;

/**
 * write a java program to sort a given array
 */
public class Assignment8 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //add to array list
        arrayList.add(1);
        arrayList.add(-10);
        arrayList.add(6);
        arrayList.add(-900);
        arrayList.add(23);
        arrayList.add(1000);
        //before sort
        System.out.println(arrayList);
        //use Collections.sort()
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //in case using something built in was too easy
        //in same order as collections.sort
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < i; j++) {
                int tempI = arrayList.get(i);
                int tempJ = arrayList.get(j);
                if (tempI < tempJ) {
                    arrayList.set(i, tempJ);
                    arrayList.set(j, tempI);
                }

            }

        }
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
    }
}
