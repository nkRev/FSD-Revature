package com.nicky.day6;

import java.util.ArrayList;
import java.util.Collections;

class Customer {
    public int id;
    public String name;
    public int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Demo12 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(2, "Mark", 20));
        customers.add(new Customer(1, "Watson", 18));
        customers.add(new Customer(3, "Paul", 30));
        customers.add(new Customer(15, "Alyson", 27));
        customers.add(new Customer(12, "Stacy", 30));

        System.out.println("Before sorting");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        //this lambda expression is comparing c1 and c2 by name.
        Collections.sort(customers, (c1, c2) -> {
            return c1.name.compareTo(c2.name);
        });


        System.out.println("After sorting");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
