package com.nicky.day3;

/**
 * NullPointerException heirarchy goes something like
 * Throwable->Exception->Runtime Exception
 */
class Customer {
    public void display() {
        System.out.println("display...");
    }
}

public class Demo26 {

    public static void main(String[] args) {
        String str = "Nicky";
        System.out.println(str.length());//gives length of str (5)
        String str2 = null;
        try {
            System.out.println(str2.length());//gives null pointer exception
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        Customer customer1 = new Customer();
        customer1.display();

        Customer customer2 = null;
        //since customer2 is null it will throw a NullPointerException
        // so its in a try block
        try {
            customer2.display();
        } catch (NullPointerException e) {
            //print built-in exception message;
            System.out.println(e.getMessage());
        }

    }
}
