package com.nicky.day3;

public class Demo27 {
    public static void main(String[] args) {
        //print 1 calling print 2 and print 2 calling print one infinitely
        // will throw a StackOverFlowError
        try{
           print1();
        }catch (StackOverflowError e){
            System.out.println(e.getMessage());
        }
    }
    public static void print1(){
        print2();
    }
    public static void print2(){
        print1();
    }
}
