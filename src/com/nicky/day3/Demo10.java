package com.nicky.day3;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        String message = "Hello, welcome to java";
        String[] result = message.split("\\,");

        //first element of array will be Hello, second element would be welcome to java
        System.out.println(Arrays.toString(result));

        result = message.split("\s"); // \s is the same as " "

        /**
         * each word separated by a single space " " will be split into a result
         * array that is separated by a comma due to toString method
         *
         * printline resut will be as follows:
         * -> Hello,, welcome, to, java
         *
         *element 1      Hello,
         *element 2      welcome
         *element 3      to
         *element 4      java
         */
        System.out.println(Arrays.toString(result));

        // this for-loop prints the result array in a separate lines separated by a space " "
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        //newline
        System.out.println();

        // this for-each loop prints the result array in a separate lines separated by a space " "
        for (String s : result) {
            System.out.println(s);
        }


    }
}
