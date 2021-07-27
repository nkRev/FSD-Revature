package com.nicky.day2;
abstract class Calculator2{
    public  void addNumber(int num1, int num2){
        System.out.println("Add: "+(num1+num2));
    }
    public  void subNumber(int num1, int num2){
        System.out.println("Subtract: "+(num1-num2));
    }

    public abstract void mulNumber(int num1, int num2);
    public abstract void divNumber(int num1, int num2);
}
class Test2 extends Calculator2{
    @Override
    public void mulNumber(int num1, int num2) {
        System.out.println("Multiply: "+(num1*num2));
    }

    @Override
    public void divNumber(int num1, int num2) {
        System.out.println("Divide: "+(num1/num2));
    }
}
public class Demo15 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.addNumber(1, 2);
        test2.subNumber(19,9);
        test2.mulNumber(10,2);
        test2.divNumber(10,2);
    }
}
