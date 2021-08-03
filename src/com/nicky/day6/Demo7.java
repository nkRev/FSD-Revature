package com.nicky.day6;

class Engine{
    public void getEngine(){
        System.out.println("4 cylinder");
    }
}
class Tire{
    public void getTire(){
        System.out.println("all season");
    }
}
class CarFactory2{
    public static void getInstance(int id){
        switch (id){
            case 0:
                System.out.println("xyz");
                break;
            case 1:
                System.out.println("abc");
                break;
        }
    }
}
class Car{
    Engine engine;
    Tire tire;
    public Car(Engine engine, Tire tire){
        this.engine = engine;
        this.tire = tire;
    }
}
public class Demo7 {
    public static void main(String[] args) {

    }
}
