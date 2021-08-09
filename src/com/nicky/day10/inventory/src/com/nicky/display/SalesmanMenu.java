package com.nicky.display;

public class SalesmanMenu implements Display{

    @Override
    public void display() {
        System.out.println("***********************");
        System.out.println("1. Add Salesman");
        System.out.println("2. Delete Salesman");
        System.out.println("3. Update Salesman");
        System.out.println("4. View All Salesmen");
        System.out.println("5. View a Salesman");
        System.out.println("0. To return");
        System.out.println("***********************");
    }
}
