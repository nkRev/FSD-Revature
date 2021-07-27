package com.nicky.day1;

public class Demo7 {
    public static void main(String[] args) {
        int number= 4;
        //originally without the for loop switch will throw default since number =4 and it is not a case
        for(int i=1; i<=number; i++){
            switch (i){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                default:
                    System.out.println("not a valid number");
            }
        }

    }
}
