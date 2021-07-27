package com.nicky.day2;
class Bike{
    public final void drive(){
        System.out.println("Driving");
    }
}
class Honda extends Bike{
    //because parent method is final, you cannot override that method
//    public void drive(){
//        System.out.println("Driving....");
//    }
}
public class Demo12 {
    public static void main(String[] args) {

    }
}
