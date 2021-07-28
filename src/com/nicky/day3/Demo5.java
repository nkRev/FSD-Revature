package com.nicky.day3;

public class Demo5 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = "Paul";
        String s4 = new String("Mark");


        System.out.println(s1.compareTo(s2)); // returns 0 because they are equal
        System.out.println(s1.compareTo(s3)); // returns - int because s1 is lexicographically less than s3
        System.out.println(s1.compareTo(s4)); // returns 0 because they are equal, although they are in different parts of the heap
        System.out.println(s3.compareTo(s1)); // returns + int because s3 is lexicographically larger than s1

    }
}
