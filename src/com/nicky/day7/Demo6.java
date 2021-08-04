package com.nicky.day7;

class Employee{
    String name;
    public <T> Employee(T name){
        this.name = name.toString();
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nicky");
        Employee emp2 = new Employee(123);
        Employee emp3  = new Employee(12+"nicky");

    }
}
