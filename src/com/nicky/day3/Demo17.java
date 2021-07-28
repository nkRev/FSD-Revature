package com.nicky.day3;

public class Demo17 {
    public static void main(String[] args) {
        int a = 40;
        //if we set b to 0 we cannot divide by zero, it would cause an ArithmeticException on line 8
        int b = 20;
        int c = a / b;
        System.out.println(c);

    }
}
