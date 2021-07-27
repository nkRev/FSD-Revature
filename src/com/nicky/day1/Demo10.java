package com.nicky.day1;

public class Demo10 {
    public static void main(String[] args) {
       //this nested for-loop will print reverse right angle triangle.
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
