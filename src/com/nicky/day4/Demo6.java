package com.nicky.day4;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Stacy");
        names.add("Jerry");
        names.add("Tom");
        names.add("Nicky");
        System.out.println("Printing names");
        System.out.println(names);


        //getting elements on a specified index
        System.out.println("getting an element at a specified index\n" + names.get(1));


        System.out.println("Adding an element");
        //adding an element on a specific index
        names.add(1, "John");
        System.out.println(names);

        //merging two lists
        ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Rachel");
        newNames.add("Jojo");


        //adding all names to end of list
//        names.addAll(newNames);
//        System.out.println("added new names");
//        System.out.println(names);

        //adding second list element to specified index
        names.addAll(0, newNames);
        System.out.println(names);

        //remove
        names.remove("Tom");
        System.out.println(names);

        //remove by index
        names.remove(0);
        System.out.println(names);

        //removeAll by collection
        names.removeAll(newNames);
        System.out.println(names);

        //removing an element based on condition
        names.removeIf(name -> name.contains("Nicky"));
        System.out.println(names);
    }
}
