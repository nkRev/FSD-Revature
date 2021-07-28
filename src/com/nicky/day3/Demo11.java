package com.nicky.day3;

import com.nicky.day1.HelloWorld;

public class Demo11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append("World");
        System.out.println(sb); //prints HelloWorld
    }
}
