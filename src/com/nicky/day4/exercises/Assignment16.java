package com.nicky.day4.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * write a Java program to copy all the mappings from the specified map
 * to another map
 */
public class Assignment16 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "BMW");
        map.put(2, "Honda");
        map.put(3, "dog");
        map.put(0, "fish");
        map.put(23, "flower");
        System.out.println("Original Map: " + map);

        //one way
        Map<Integer, String> newMap = new HashMap<>(map);
        System.out.println(newMap);

        newMap.clear();
        System.out.println(newMap);

        //another way
        newMap.putAll(map);
        System.out.println(newMap);

    }
}
