package com.nicky.day6;

interface Hello {
    public String greeting();
}

interface Welcome {
    public String greeting(String name);
}

interface Calculation {
    public int addNumber(int a, int b);
}

interface Say {
    public void sayHello(String name);
}

public class Demo10 {
    public static void main(String[] args) {
        //parameter-less
        Hello hello = () -> {
            return "Welcome Guest";
        };
        System.out.println(hello.greeting());
        //with single parameter
        Welcome welcome = (name) -> {
            return "Welcome " + name;
        };
        System.out.println(welcome.greeting("Nicky"));

        //with multiple parameters
        Calculation calculation = (a, b) -> {
            return a + b;
        };

        System.out.println(calculation.addNumber(20, 30));

        //without return statement
        Say say = name -> {
            System.out.println("Hello " + name);
        };
        say.sayHello("Watson");
    }
}
