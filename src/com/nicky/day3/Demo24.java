package com.nicky.day3;

import java.util.concurrent.ExecutionException;

public class Demo24 {
    public static void main(String[] args) throws Exception {
        //if passing methods around to each other
        //each method and main has to be able to throw that exception
       try{
           doSomething();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    /**
     * if we want to throw an exception before going to main
     * we can remove the throws Exception
     * and do our try catch block
     *
     */

    public static void doSomething() throws Exception {
        doSomethingElse();
    }
    public static void doSomethingElse() throws Exception {
        doSomethingElseSomethingElse();
    }
    public static void doSomethingElseSomethingElse() throws Exception {
        throw new Exception();
    }
}
