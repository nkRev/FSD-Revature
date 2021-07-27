package com.nicky.day2;
//when parent class is final, it cannot be inherited
final class Parent1{
    public void talk(){
        System.out.println("I am a parent and what I say is final!");
    }
}
//Parent1 is final, Child1 cannot extend Parent. it will throw an error
//class Child1 extends Parent1{
//
//}
public class Demo13 {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        p1.talk();
    }
}
