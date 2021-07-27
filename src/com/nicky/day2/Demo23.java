package com.nicky.day2;

interface Drawable2 {
    void draw();

    static void area() {
        System.out.println("Retrieving area...");
    }
}

class Circle2 implements Drawable2 {

    @Override
    public void draw() {
        System.out.println("drawing...");
    }
}

public class Demo23 {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        circle2.draw();
        Drawable2.area();
    }
}
