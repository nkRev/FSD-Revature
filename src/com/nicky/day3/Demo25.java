package com.nicky.day3;

import java.lang.reflect.Array;

/**
 * ArrayIndexOutOfBoundException chain
 * goes something like this
 * Throwable -> Exception -> RuntimeException-> IndexOutOfBound
 */

public class Demo25 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        //System.out.println(a[10]); //will throw ArrayIndexOutOfBoundException so we put in try block;
        try{
            System.out.println(a[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
