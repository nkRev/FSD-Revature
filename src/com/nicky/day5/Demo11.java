package com.nicky.day5;

class Table2 {
    public void printTable(int number) {
        //synchronized block
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(number * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class MyThread01 extends Thread{
    Table2 table;
    public MyThread01(Table2 table){
        this.table = table;
    }
    @Override
    public void run(){
        table.printTable(5);
    }
}

class MyThread02 extends Thread{
    Table2 table;
    public MyThread02(Table2 table){
        this.table = table;
    }
    @Override
    public void run(){
        table.printTable(5);
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Table2  table2 = new Table2();
        MyThread01 t1 = new MyThread01(table2);
        MyThread02 t2 = new MyThread02(table2);

        t1.start();
        t2.start();

    }
}
