package com.nicky.display;

public class MainMenu implements Display {

    @Override
    public void display() {
        System.out.println("***********************");
        System.out.println("1. Customer Menu");
        System.out.println("2. Orders Menu");
        System.out.println("3. Salesman Menu");
        System.out.println("0. Quit");
        System.out.println("***********************");
    }
}
