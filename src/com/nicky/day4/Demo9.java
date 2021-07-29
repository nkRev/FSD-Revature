package com.nicky.day4;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet will not retain insertion order
 */
public class Demo9 {
    public static void main(String[] args) {
        //create a HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Mark");
        set.add("Nicky");
        set.add("Paul");
        set.add("Nancy");
        set.add("Amanda");
        set.add("Nanda");
        set.add("Watson");
        set.add("Mark"); //wont be stored due to checking of unique hash values

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //remove()
        set.remove("Paul");
        System.out.println(set);

        //second hashset
        HashSet<String> set2 = new HashSet<>();
        set2.add("Stacy");
        set2.add("Aaron");
        set2.add("Zachary");

        //adding set2 to set1
        set.addAll(set2);
        System.out.println(set);

        //removeAll() removes all, in this case elements from set2
        set.removeAll(set2);
        System.out.println(set);

        //removeIf() removes based on filter, in this case removes names if their name starts if 'N'
        set.removeIf(n -> (n.charAt(0) == 'N'));
        System.out.println(set);

        //cear() clears the elements from the set
        set.clear();
        System.out.println(set);

    }
}
