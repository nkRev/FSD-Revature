package com.nicky.day2;

class Counter {
    static int count = 0; //with count being static, regardless of obj it will continue the counter in constructor

    public Counter() {
        count++;
        System.out.println(count);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        //when public Counter() is not static c1-c3 will print 1 due to count not being in the same memory location
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }

}
