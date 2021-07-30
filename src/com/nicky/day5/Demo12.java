package com.nicky.day5;
class Table3{
    public void printTable(int number){
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.println(number*i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class Demo12 {
    public static void main(String[] args) {
        Table3 table3 = new Table3();
        Thread t1 = new Thread(){
          @Override
          public void run(){
              table3.printTable(4);
          }
        };
        Thread t2   = new Thread(){
            @Override
            public void run() {
                table3.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
