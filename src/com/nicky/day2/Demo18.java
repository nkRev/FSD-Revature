package com.nicky.day2;

abstract class Test100 {
    public abstract void display();
}

abstract class Test200 extends Test100 {
    public abstract void display();
}

abstract class Test300 extends Test200 {
    public abstract void display();
}

/**
 * although all three of the abstract classes have the same display method name
 * you will implement one Overridden display method when you go to implement it
 */
class Output2 extends Test300 {

    @Override
    public void display() {
        System.out.println("This is the display method");
    }
}

public class Demo18 {
    public static void main(String[] args) {
        Output2 o2 = new Output2();
        o2.display();
    }
}
