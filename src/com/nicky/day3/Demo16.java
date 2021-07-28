package com.nicky.day3;

public class Demo16 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.indexOf('o')); //4
        System.out.println(str.indexOf('o', 5)); //7
        System.out.println(str.indexOf("ll")); //2 it starts at index 2 so index 2 will be returned

    }
}
