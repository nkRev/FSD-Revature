package com.nicky.day5;
class MultiThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        MultiThreadDemo threadDemo = new MultiThreadDemo();
        //always call threads by .Start()
        threadDemo.start(); //start() will call run automatically
    }
}
