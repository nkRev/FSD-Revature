package com.nicky.day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo7 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("mark");
        names.add("Paul");
        names.add("stacy");
        names.add("justin");

        //use iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //use forloop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //use for each
        for (String s :
                names) {
            System.out.println(s);
        }

        names.forEach(s -> {
            System.out.println(s);
        });
    }
}
