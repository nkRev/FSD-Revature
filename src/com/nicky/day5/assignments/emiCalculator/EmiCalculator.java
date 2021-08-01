package com.nicky.day5.assignments.emiCalculator;

public class EmiCalculator {
    public double emiCalculator(double loanAmt, double rate, double time) {
        time *= 12; //puts time in months
        rate = rate/(12*100); //to get percentage of the rate
        //(principal * rate * (1 + rate)^time)/( (1+rate)^time - 1)
        double emi = (loanAmt * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
        return emi;
    }
}
