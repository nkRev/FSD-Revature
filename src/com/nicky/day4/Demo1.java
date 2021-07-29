package com.nicky.day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        //arraylist with type String
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Mark");
        stringArrayList.add("Nicky");
        stringArrayList.add("Jerry");

        //same output
//        System.out.println(stringArrayList.toString());
//        System.out.println(stringArrayList);

        Iterator iterator = stringArrayList.iterator();
        //hasNext() will check if iterator has the next element
        while (iterator.hasNext()) {
            //prints the element and moves to next iterator
            System.out.println(iterator.next());
        }

        for (String name : stringArrayList) {
            System.out.println(name);
        }

    }
}
