package com.nicky.display;

public class OrderMenu implements Display{


    @Override
    public void display() {
        System.out.println("***********************");
        System.out.println("1. Add Order");
        System.out.println("2. Delete Order");
        System.out.println("3. Update Order");
        System.out.println("4. View All Orders");
        System.out.println("5. View an Order");
        System.out.println("0. To return");
        System.out.println("***********************");
    }
}
