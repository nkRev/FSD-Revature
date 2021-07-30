package com.nicky.day5;

public class Demo22 {
    public static void main(String[] args) {
        //implicit conversion
        int num = 10;
        long number = num; //automatically converts int to long
        float c = number; //automatically converts long into float
        double d = c; // automatically converts float to double

        System.out.println(num);
        System.out.println(number);
        System.out.println(c);
        System.out.println(d);


    }
}
