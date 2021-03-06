package com.nicky.day2;

class Calculator {
    //non-static method: instance method
    public void addNumber(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    //static method: can be called by the class name
    public static void subtractNumber(int num1, int num2) {
        System.out.println(num1 - num2);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addNumber(20, 10);

        Calculator.subtractNumber(20, 10);
    }
}
