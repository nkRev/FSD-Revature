package com.nicky.day3;

public class Demo6 {
    public static void main(String[] args) {
        String str = "Hello" + "World"; //concatenating two strings by using + operator
        System.out.println(str);
        /**
         * String str2 = (new StringBuilder()).append("Hello").append("World").toString();*
         * ||||||
         * VVVVVV
         * it is the same as str but this is what happens behind the scenes
         * to perform the concatenation with the + operator
         */

        /**
         * str2's 10+20+30 will add up to 60
         * then concatenate the string literal Sum
         * then concatenate 40 and 50 together
         */
        String str2 = 10 + 20 + 30 + " Sum " + 40 + 50;
        System.out.println(str2);

    }
}
