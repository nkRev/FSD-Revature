package com.nicky.model;

public class Customer {
    private int customer_id;
    private String customer_name;
    private String city;
    private int grade;
    private int salesman_id;


    public Customer() {
    }

    public Customer(int customer_id, String customer_name, String city, int grade, int salesman_id) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.city = city;
        this.grade = grade;
        this.salesman_id = salesman_id;
    }

    /**
     * SETTERS AND GETTERS FOR CUSTOMER MODEL
     */

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSalesman_id() {
        return salesman_id;
    }

    public void setSalesman_id(int salesman_id) {
        this.salesman_id = salesman_id;
    }

    @Override
    public String toString() {
        return String.format("Customer ID: %d, Customer Name: %s, City: %s, Grade: %d, Salesman ID: %d", customer_id, customer_name, city, grade,salesman_id );
    }
}
