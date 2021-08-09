package com.nicky.model;

public class Salesman {
    private int salesman_id;
    private String name;
    private String city;
    private double commission;


    public Salesman(int salesman_id, String name, String city, double commission) {
        this.salesman_id = salesman_id;
        this.name = name;
        this.city = city;
        this.commission = commission;
    }

    public Salesman() {

    }

    /**
     * SETTER AND GETTERS FOR SALESMAN MODEL
     */

    public int getSalesman_id() {
        return salesman_id;
    }

    public void setSalesman_id(int salesman_id) {
        this.salesman_id = salesman_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {

        return String.format("ID: %d,Name: %s, City: %s, Commission: %.2f", salesman_id, name, city, commission);
    }
}
