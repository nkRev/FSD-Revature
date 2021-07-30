package com.nicky.day5;

//without synchronization
//class Table{
//    public void printTable(int number){
//        for (int i = 0; i <=10; i++) {
//            System.out.println(number + " x " + i +" = " + number *i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
// with synchronization, this allows a thread to complete its task before another thread does theirs
class Table {
    public synchronized void printTable(int number) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//multithreading
class MyThread1 extends Thread {
    Table table;

    public MyThread1(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table table;

    public MyThread2(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(500);
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Table table = new Table();
        //table.printTable(20);
        MyThread1 t1 = new MyThread1(table);
        MyThread2 t2 = new MyThread2(table);

        t1.start();
        t2.start();
    }


}
