package com.nicky.day5;

import javax.sql.rowset.Joinable;

class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread name: "+Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}
public class Demo7 {
    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        ThreadJoinDemo t3 = new ThreadJoinDemo();
        t1.start();
        try {
            t1.join(); //waits for a thread to finish before executing other threads
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();

    }
}
