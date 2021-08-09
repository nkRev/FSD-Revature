package com.nicky.display;

public class CustomerMenu implements Display{

    @Override
    public void display() {
        System.out.println("***********************");
        System.out.println("1. Add Customer");
        System.out.println("2. Delete Customer");
        System.out.println("3. Update Customer");
        System.out.println("4. View All Customers");
        System.out.println("5. View a Customer");
        System.out.println("0. To return");
        System.out.println("***********************");
    }
}
