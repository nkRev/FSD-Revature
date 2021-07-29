package com.nicky.day4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo14 {
    public static void main(String[] args) {
        Deque<String>   deque = new ArrayDeque<>();
        deque.add("Mark");
        deque.add("Paul");
        deque.add("Watson");
        deque.offer("Stacy");
        deque.offerFirst("Nicky");

        deque.forEach(names-> {
            System.out.println(names);
        });
    }
}
