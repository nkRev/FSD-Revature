package com.nicky.day1;
class Parent{
    //if this constructor is private it will not be accessible to the child class
    public Parent(){
        System.out.println("Parent constructor called");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child constructor called");
    }
}
public class demo24 {
    public static void main(String[] args) {
        Parent p = new Parent(); //calls parent constructor
        System.out.println();
        Child c = new Child(); //calls in order parent constructor (public) then child constructor

    }
}
