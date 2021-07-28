package com.nicky.day3;

public class Demo18 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 0;

        /**
         * since c =a/b is risky code you put it
         * in a try block to run it
         * in the case where c=a/b has an error,
         * it will be caught in the catch block
         * and the appropriate message will be given
         */
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
