package com.nicky.day1;

public class Demo9 {
    public static void main(String[] args) {

        //this nested for-loop will print out a right angle triangle out of asterisks (*)
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
