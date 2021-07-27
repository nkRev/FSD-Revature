package com.nicky.day2;
class Calculation{
    public void test(){
        System.out.println("1st method");
    }
    public void test(int a){
        System.out.println("2nd method");
    }
    public void test(String a){
        System.out.println("3rd method");
    }
    public void test(int a, String b){
        System.out.println("4th method");
    }
    public void test(String a, int b){
        System.out.println("5th method");
    }
}
public class Demo8 {
    public static void main(String[] args) {
    Calculation cal = new Calculation();
    cal.test(); //1st
    cal.test(10); //2nd
    cal.test("A"); //3rd
    cal.test(10, "C"); //4th
    cal.test("Sfsdajfad", 1000); //5th


    }
}
