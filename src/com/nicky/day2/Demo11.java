package com.nicky.day2;
class Car{
    public final int speedLimit = 60;
    public void drive(){
        //speedLimit = 100;
        System.out.println("car is driving at the speed of "+speedLimit);
    }
}
public class Demo11 {
    public static void main(String[] args) {
        Car car = new Car();
        //car.speedLimit = 80; //once final is set we cannot modify it
        car.drive();
    }
}
