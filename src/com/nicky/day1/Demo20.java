package com.nicky.day1;

class Calculator {

    int a = 10;
    int b = 20;

    public Calculator() {
        System.out.println("Parameter less constructor");
    }

    public Calculator(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public void addNumbers() {
        System.out.println(a + b);
    }

}

public class Demo20 {
    public static void main(String[] args) {
        //instantiate calculator obj
        Calculator cal1 = new Calculator();
        cal1.addNumbers(); //call addNumbers method from calculator class

        Calculator cal2 = new Calculator();
        cal2.addNumbers();  //all addNumbers method from calculator class for new calculator obj
    }
}
