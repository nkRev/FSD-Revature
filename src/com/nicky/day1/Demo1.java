package com.nicky.day1;

public class Demo1 {
    static int z = 100; //static variable
    int x = 10; //can be used anywhere

    public void addNumber() {
    int a =10; //local variable
    int b = 20; //local variable
    System.out.println(a+b);
    }
    public void subNumber(){
        int y=5;
        System.out.println(x-y);
    }
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.addNumber();
        demo1.subNumber();
    }
}
