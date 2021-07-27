package com.nicky.day2;
interface X{
    void print();
    interface Y{
        void display();
    }
}
//if nested interface X.Y to reach nested Y interface
class Testxy implements X, X.Y{

    @Override
    public void print() {
        System.out.println("From interface X");
    }

    @Override
    public void display() {
        System.out.println("From interface Y inside of interface X");
    }
}
public class Demo24 {
    public static void main(String[] args) {
        Testxy xy = new Testxy();
        xy.print();
        xy.display();
    }
}
