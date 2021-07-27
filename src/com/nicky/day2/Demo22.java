package com.nicky.day2;
interface Drawable{
    void draw();
    default void print(){
        System.out.println("Printing...");
    }
}
class Rect implements Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }
}
public class Demo22 {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.draw();
        rect.print();
    }
}
