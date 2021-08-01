package com.nicky.day5.assignments.emiCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmiCalculator calculator = new EmiCalculator();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the EMI Calculator program");
        System.out.println("Enter loan amount: ");
        double principal = in.nextDouble();
        System.out.println("Enter interest rate: ");
        double rate = in.nextDouble();
        System.out.println("Enter time in years: ");
        double time = in.nextDouble();
        System.out.printf("Your Monthly EMI is: %.2f \n", calculator.emiCalculator(principal, rate, time));
    }
}
