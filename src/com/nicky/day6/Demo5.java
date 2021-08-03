package com.nicky.day6;

class Calculator {
    public static int count = 0;

    //instance of the class set to null;
    private static Calculator instance = null;

    private Calculator() {
        count++;
        System.out.println("Count: " + count);
        System.out.println("Constructor called");
    }

    public static Calculator getInstance() {
        if (instance == null) {
            //create a new instance of Calculator
            instance = new Calculator();

        }
        return instance;
    }
}

public class Demo5 {
    public static void main(String[] args) {
//        Cannot be called because constructor is private and we must get the instance
//        Calculator cal1 = new Calculator();
//        Calculator cal1 = new Calculator();
//        Calculator cal1 = new Calculator();

        //will call constructor once (count: 1) and the printline once
        Calculator cal1 = Calculator.getInstance();
        Calculator cal2 = Calculator.getInstance();
        Calculator cal3 = Calculator.getInstance();

    }
}
