package com.nicky.day3;

public class Demo22 {
    public static void main(String[] args) {
        //case 1: exception does not occur
        try{
            int c = 10/5;
            System.out.println(c);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Case 1: finally called");
        }

        //case 2: exception occurs but not handled
        try{
            int c = 20/0;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Case 2: finally called");
        }

        //case 3: exception occurs and handled
        try{
            int c =10/0;
            System.out.println(c);
        }catch(Exception e){
            System.out.println(e.getMessage());

        }finally {
            System.out.println("Case 3: finally called");
        }
    }
}
