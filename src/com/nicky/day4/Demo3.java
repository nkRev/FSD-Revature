package com.nicky.day4;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("blue");
        colors.add("pink");
        colors.add("white");
        colors.add("red");

        //before sorting
        System.out.println("Before Sort:");
        // for each color in colors
        for (String color :
                colors) {
            System.out.println(color);
        }
        //after sorting
        System.out.println("After Sort: ");
        Collections.sort(colors);
        //for each c in colors
        for (String color :
                colors) {
            //print c
            System.out.println(color);
        }

        //list of numbers
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(1);
        nums.add(0);

        //before sort
        System.out.println("Before sort: ");
        for (int num :
                nums) {
            System.out.println(num);
        }
        System.out.println("After sort: ");
        Collections.sort(nums);
        for (int n :
                nums) {
            System.out.println(n);
        }

    }
}
