package com.nicky.day3;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        String s4 = "Nicky";

        System.out.println(s1 == s2); //true, both reference refers to the same instance in String pool
        System.out.println(s1 == s3); //false, because s3 refers to an instance created in normal heap
        System.out.println(s1 == s4); //false, since they are two completely different references in string pool
    }
}
