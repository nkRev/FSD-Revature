package com.nicky.day4;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Stacy");
        names.add("Jerry");
        names.add("Tom");
        names.add("Nicky");
        System.out.println("For loop");
        //for
        for (int i = 0; i < names.size(); i++) {
            //prints names in index
            System.out.println(names.get(i));
        }
        System.out.println("for each loop");
        //for each String name in names
        for (String name :
                names) {
            //print name
            System.out.println(name);
        }
        System.out.println("for each method");
        //forEach method takes a consumer(variable) and then -> { //code or //print}
        names.forEach(name ->{
            System.out.println(name);
        });
    }
}
