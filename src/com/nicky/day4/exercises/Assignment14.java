package com.nicky.day4.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a java program to associate the specified value with the specified key in a HashMap
 */
public class Assignment14 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "dog");
        map.put(2, "cat");
        map.put(3, "Mark");
        map.put(4, "Frankenstein");
        System.out.println(map);
    }
}
