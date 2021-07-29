package com.nicky.day4;

import java.util.PriorityQueue;

public class Demo13 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Mark");
        priorityQueue.add("Paul");
        priorityQueue.add("Watson");
        priorityQueue.add("John");

        priorityQueue.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("Head: "+priorityQueue.element());
        System.out.println("Head: "+priorityQueue.peek());
        System.out.println("Removed: "+priorityQueue.remove());
        System.out.println(priorityQueue.poll());

        System.out.println();
        priorityQueue.forEach(name -> {
            System.out.println(name);
        });


    }

}
