package com.nicky.day5.assignments.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean finished = false;
        String selection;
        do {
            display();
            System.out.println("Please make your selection: ");
            selection = in.next().toLowerCase();
            switch (selection) {
                case "1":
                case "addition":
                case "add":
                    System.out.println("First number: ");
                    double num1 = in.nextDouble();
                    System.out.println("Second number: ");
                    double num2 = in.nextDouble();
                    calculator.setOperationStrat(new Addition());
                    System.out.println(num1 + " + " + num2 + " = " + calculator.calculate(num1, num2));
                    break;
                case "2":
                case "subtraction":
                case "minus":
                    System.out.println("First number: ");
                    num1 = in.nextDouble();
                    System.out.println("Second number: ");
                    num2 = in.nextDouble();
                    calculator.setOperationStrat(new Subtraction());
                    System.out.println(num1 + " - " + num2 + " = " + calculator.calculate(num1, num2));
                    break;
                case "3":
                case "multiplication":
                case "multiply":
                    System.out.println("First number: ");
                    num1 = in.nextDouble();
                    System.out.println("Second number: ");
                    num2 = in.nextDouble();
                    calculator.setOperationStrat(new Multiplication());
                    System.out.println(num1 + " * " + num2 + " = " + calculator.calculate(num1, num2));
                    break;
                case "4":
                case "division":
                case "divide":
                    System.out.println("First number: ");
                    num1 = in.nextDouble();
                    System.out.println("Second number: ");
                    num2 = in.nextDouble();
                    calculator.setOperationStrat(new Division());
                    System.out.println(num1 + " / " + num2 + " = " + calculator.calculate(num1, num2));
                    break;
                case "0":
                case "quit":
                case "exit":
                case "terminate":
                    System.out.println("Terminating....");
                    finished = true;
            }


        } while (!finished);

    }

    public static void display() {
        System.out.println("Welcome to the Calculator program!");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. To quit");
    }
}
