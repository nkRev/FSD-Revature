package com.nicky.day5;
class ThreadNameDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
public class Demo5 {
    public static void main(String[] args) {
        ThreadNameDemo th1 = new ThreadNameDemo();
        ThreadNameDemo th2  = new ThreadNameDemo();
        System.out.println("Name of th1: " + th1.getName());
        System.out.println("Name of th2: "+th2.getName());

        th1.start();
        th2.start();

        th1.setName("New name for th1");
        th2.setName("New name for th2");
        System.out.println("Name of th1: " + th1.getName());
        System.out.println("Name of th2: "+th2.getName());
    }
}
