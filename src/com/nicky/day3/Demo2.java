package com.nicky.day3;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Hello"; //string literal
        //String str1 =str.concat("World"); //we are using concat() to append the string at the end, but assigned to a new String variable
        System.out.println(str); //this statement will print only "Hello" because strings are immutable
        //System.out.println(str1);//this statement will print a concatenated HelloWorld at the end of str's "hello"

        String str1 = "Hello";

        //like above, we use concat() to append the string at the end, but we reassign str1 so no new variable is created
        str1 = str1.concat("World");
        System.out.println(str1);
    }
}
