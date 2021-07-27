package com.nicky.day2;

//interface I1{
//    void print();
//}
//
//interface I2 extends I1{
//    void display();
//}
//
//class Test5 implements I2{
//
//    @Override
//    public void print() {
//
//    }
//
//    @Override
//    public void display() {
//
//    }
//}
interface I1 {
    void print();
}

interface I2 {
    void display();
}

//inheriting multiple interfaces
class Test5 implements I1, I2 {


    @Override
    public void print() {
        System.out.println("This is from I1");
    }

    @Override
    public void display() {
        System.out.println("This is from I2");
    }
}

public class Demo21 {
    public static void main(String[] args) {
        Test5 t5 = new Test5();
        t5.print();
        t5.display();
    }
}
