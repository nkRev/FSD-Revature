package com.nicky.day1;
class Parent1{
    public void display(){
        System.out.println("Parent display");
    }
}
class Child1 extends Parent1{
    public void display(){
        System.out.println("Child display");
    }
}
public class Demo28 {
    public static void main(String[] args) {



        Child1 child1 = new Child1();
        child1.display(); //child display prints out

        Parent1 p1 = new Child1();
        //accesses and prints child display to print parent display either make new Parent1 obj or type cast
        p1.display();
    }

}
