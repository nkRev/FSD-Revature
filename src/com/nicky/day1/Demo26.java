package com.nicky.day1;
class X{
    public void test1(){
        System.out.println("X");
    }
}
class Y extends X{
    public void test2(){
        System.out.println("y");
    }
}
class Z extends Y{
    public void test3(){
        System.out.println("z");
    }
}
public class Demo26 {
    public static void main(String[] args) {
        X x1 = new X();
        x1.test1();

        Y y1 = new Y();
        y1.test1();
        y1.test2();

        Z z1 = new Z();
        z1.test1();
        z1.test2();
        z1.test3();
    }
}
