package com.nicky.day5;
class ThreadSleepDemo extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
public class Demo3 {
    public static void main(String[] args) {
    ThreadSleepDemo sleepDemo = new ThreadSleepDemo();
    ThreadSleepDemo sleepDemo1 = new ThreadSleepDemo();
    sleepDemo.start();
    sleepDemo1.start();
    }
}
