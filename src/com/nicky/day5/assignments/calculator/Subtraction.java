package com.nicky.day5.assignments.calculator;

public class Subtraction implements IOperationStrat {
    @Override
    public double calculateResult(double num1, double num2) {
        return num1 - num2;
    }
}
