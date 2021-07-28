package com.nicky.day3;

public class Demo29 {
    public static void main(String[] args) {
        int a = 10;
        int b=20;
        int c= 0;

        try{
            c=a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            //nullpointer or numberformat exceptions to be caught
            // common exceptions can be grouped
        }catch (NullPointerException | NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
