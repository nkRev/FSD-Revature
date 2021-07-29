package com.nicky.day4;


import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Stacy");
        names.add("Mark");
        names.add("Nicky");
        names.add("Julia" + "Sam"); // this just adds a concatenated string

        //get
        System.out.println(names.get(1)); //mark
        //set
        names.set(1, "James Adam");

        for (String s :
                names) {
            System.out.println(s);
        }

    }
}
