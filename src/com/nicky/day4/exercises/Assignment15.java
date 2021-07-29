package com.nicky.day4.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * write a Java program to count the number of key-value (size) mappings in a map
 */
public class Assignment15 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "BMW");
        map.put(2, "Honda");
        map.put(3, "dog");
        map.put(0, "fish");
        map.put(23, "flower");

        System.out.println("Map size is: " + map.size());
    }
}
