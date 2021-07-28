package com.nicky.day3;

public class Demo13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //16
        sb.append("Hello");
        System.out.println(sb.capacity()); //16
        sb.append("Welcome to Java class, Have a nice day");
        //prints out 43 but the general formula goes ((old capacity*2)+2)
        System.out.println(sb.capacity());
    }
}
