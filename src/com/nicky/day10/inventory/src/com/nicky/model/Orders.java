package com.nicky.model;


import java.sql.Date;

public class Orders {
    private int ord_no;
    private double purch_amt;
    private Date ord_date;
    private int customer_id;
    private int salesman_id;

    public Orders() {

    }

    public Orders(int ord_no, double purch_amt, Date ord_date, int customer_id, int salesman_id) {
        this.ord_no = ord_no;
        this.purch_amt = purch_amt;
        this.ord_date = ord_date;
        this.customer_id = customer_id;
        this.salesman_id = salesman_id;
    }


    public int getOrd_no() {
        return ord_no;
    }

    public void setOrd_no(int ord_no) {
        this.ord_no = ord_no;
    }

    public double getPurch_amt() {
        return purch_amt;
    }

    public void setPurch_amt(double purch_amt) {
        this.purch_amt = purch_amt;
    }

    public Date getOrd_date() {
        return  ord_date;
    }

    public void setOrd_date(Date ord_date) {
        this.ord_date = ord_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getSalesman_id() {
        return salesman_id;
    }

    public void setSalesman_id(int salesman_id) {
        this.salesman_id = salesman_id;
    }

    @Override
    public String toString() {

        return "Order #: " + ord_no +
                ", Purchase Amount: " + purch_amt +
                ", Order Date: " + ord_date +
                ", Customer Id: " + customer_id +
                ", Salesman ID: " + salesman_id;
    }
}
