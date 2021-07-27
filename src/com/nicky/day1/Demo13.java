package com.nicky.day1;

public class Demo13 {
    public static void main(String[] args) {

        //learning how to use break keyword
        //this for-loop will loop and when i==5 it will print break and break out of loop
        for(int i=1;i<10;i++){
            if(i==5){
                System.out.println("break");
                break;
            }
            System.out.println(i);
        }
    }
}
