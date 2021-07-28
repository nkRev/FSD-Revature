package com.nicky.day3;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        String s4 = "Nicky";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // false

        String s5 = "MARK";
        System.out.println(s1.equals(s5));// false, it is case sensitive
        System.out.println(s1.equalsIgnoreCase(s5)); //true since it is ignoring case sensitivity

    }
}
