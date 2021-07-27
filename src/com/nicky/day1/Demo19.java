package com.nicky.day1;

class Test {
//    public Test(){
//        System.out.println("Constructor called..");
//    }

    int counter;
    //"sets" and prints counter object
    public Test(int counter) {
        this.counter = counter;
        System.out.println(this.counter);
    }

}

public class Demo19 {
    public static void main(String[] args) {
        //instantiate new test class obj
        Test test = new Test(100);
    }
}
