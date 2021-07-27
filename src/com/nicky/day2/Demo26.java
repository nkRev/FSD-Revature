package com.nicky.day2;
interface ICustomer{
    //interface of customer
}
class User{
    //user class
}
class Customer implements ICustomer{
    //implementation of customer interface for customer class/obj
}
public class Demo26 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        //ICustomer iCustomer = new ICustomer();
        ICustomer iCustomer = new Customer();
        //ICustomer iCustomer = new User();
    }
}
