package com.nicky.day5.assignments.calculator;

import jdk.dynalink.Operation;

public class Calculator {
    IOperationStrat operationStrat;

    public void setOperationStrat(IOperationStrat operationStrat) {
        this.operationStrat = operationStrat;
    }

    public double calculate(double num1, double num2) {
        return operationStrat.calculateResult(num1, num2);
    }
}
