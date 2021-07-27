package com.nicky.day2;
abstract class Test10{
    public abstract void display1();
}
abstract class Test20 extends Test10{
    public abstract void display2();
}
abstract class Test30 extends Test20{
    public abstract void display3();
}

/**
 * abstract classes can extend each other but
 * the class that inherits the last abstract class
 * has to implement all abstract methods from each class
 */
class Output extends Test30{

    @Override
    public void display1() {

    }

    @Override
    public void display2() {

    }

    @Override
    public void display3() {

    }
}
public class Demo17 {

}
