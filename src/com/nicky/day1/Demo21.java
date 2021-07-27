package com.nicky.day1;

class Car {
    public String name;
    public String color;
    public int price;
    public String engineType;

    public Car(String name, String color, int price, String engineType) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.engineType = engineType;
    }

    /**
     * this constructor overloads the original car constructor as a copy constructor
     * of the car object
     * @param carObj
     */
    public Car(Car carObj) {
        this.name = carObj.name;
        this.color = carObj.color;
        this.price = carObj.price;
        this.engineType = carObj.engineType;
    }

    public Car(Car carObj, int price) {
        this.name = carObj.name;
        this.color = carObj.color;
        this.price = price;
        this.engineType = carObj.engineType;
    }
}

public class Demo21 {
    public static void main(String[] args) {
        //instantiate new car objects
        Car car1 = new Car("Audi", "White", 1000, "Petrol/Gas");
        /**
         * creates a copy of car1 through second constructor
         * in car class
         */
        Car car2 = new Car(car1);
        /**
         * car3 accesses last constructor that overloads the original car constructor parameters
         * so it takes the old parameters of car1 and overloads the price.
         */
        Car car3 = new Car(car1, 20000); //overloads price of car1's parameters

    }
}
