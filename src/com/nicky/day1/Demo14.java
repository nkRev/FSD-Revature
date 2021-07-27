package com.nicky.day1;

public class Demo14 {
    public static void main(String[] args) {

        /**
         * learning how to use continue keyword
         * for loop will repeat printing i, until i==5
         * and then it would continue after 5;
         */
        for (int i = 1; i <=10; i++) {
            if (i==5){
                continue;

            }
            System.out.println(i);
        }
    }
}
