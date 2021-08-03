package com.nicky.day6;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(1);
        nums.add(3);
        nums.add(5);

        System.out.println("before sorting...");
        for (int number : nums) {
            System.out.println(number);
        }
        Collections.sort(nums);
        System.out.println("After sorting...");
        for(int number: nums){
            System.out.println(number);
        }

    }
}
